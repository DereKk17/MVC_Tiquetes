/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaReserva;
import Modelo.dao.VueloDao;
import Modelo.dto.Vuelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.dao.PasajeroDao;
import javax.swing.JOptionPane;

/**
 *
 * @author derekmac
 */
public class ControladorReserva implements ActionListener {
    
    private VistaReserva vista;
    private VueloDao modeloVuelo;
    private PasajeroDao modeloPasajero;


    public ControladorReserva(VistaReserva vista) {
        this.vista = vista;
        this.vista.codigoVuelo.addActionListener(this);
        this.vista.identificacion.addActionListener(this);
        this.vista.reservar.addActionListener(this);
        this.vista.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.reservar)){
            
            int id = Integer.valueOf(this.vista.identificacion.getText());
            
           if(!modeloPasajero.verificarPasajero(id)){
               JOptionPane.showMessageDialog(null,"El pasajero no esta registrado");
           }
           else{
               Vuelo vueloReserva = modeloVuelo.buscarVuelo(Integer.valueOf(this.vista.codigoVuelo.getText()));
               
               vueloReserva.getListaPasajeros().add(modeloPasajero.consultarPasajero(id));
           }
          
        }
    }
    
}
