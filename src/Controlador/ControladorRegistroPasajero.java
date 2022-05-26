/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaRegistroPasajero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.dao.PasajeroDao;
import Modelo.dto.Pasajero;
import javax.swing.JOptionPane;

/**
 *
 * @author derekmac
 */
public class ControladorRegistroPasajero implements ActionListener {
    
    private VistaRegistroPasajero vista;

    public ControladorRegistroPasajero(VistaRegistroPasajero vista) {
        this.vista = vista;
        this.vista.botonRegistroPasajero.addActionListener(this);
        this.vista.setVisible(true);
        
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vista.botonRegistroPasajero)){
            
            int id = Integer.valueOf(this.vista.identificacionPasajero.getText());
            String genero = this.vista.generoPasajero.getText();
            String nombre = vista.nombrePasajero.getText();
            int edad = Integer.valueOf(vista.edadPasajero.getText());
            
            Pasajero pasajero = new Pasajero(edad, id, genero, nombre);
            
            if(PasajeroDao.registrarPasajero(pasajero)){
                JOptionPane.showMessageDialog(null, "El Registro del Pasajero Fue exitosos");
            }
            else{
                JOptionPane.showMessageDialog(null, "hubo un error en el registro, vuelva a intentarlo");
            }
            
            vista.identificacionPasajero.setText("");
            vista.edadPasajero.setText("");
            vista.nombrePasajero.setText("");
            vista.generoPasajero.setText("");
        }
    }
    
}
