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
    
    private VistaRegistroPasajero vistaPasajero;
    private PasajeroDao modelo;

    public ControladorRegistroPasajero(VistaRegistroPasajero vistaPasajero,PasajeroDao modelo) {
        this.vistaPasajero = vistaPasajero;
        this.modelo = modelo;
        this.vistaPasajero.botonRegistroPasajero.addActionListener(this);
        this.vistaPasajero.setVisible(true);
        
    }

  
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vistaPasajero.botonRegistroPasajero)){
            
            int id = Integer.valueOf(this.vistaPasajero.identificacionPasajero.getText());
            String genero = this.vistaPasajero.generoPasajero.getText();
            String nombre = this.vistaPasajero.nombrePasajero.getText();
            int edad = Integer.valueOf(this.vistaPasajero.edadPasajero.getText());
            
            Pasajero pasajero = new Pasajero(edad, id, genero, nombre);
            
            if(!modelo.registrarPasajero(pasajero)){
                JOptionPane.showMessageDialog(null, "hubo un error en el registro, vuelva a intentarlo");
            }
            else{
                JOptionPane.showMessageDialog(null, "El Registro del Pasajero Fue exitosos");
            }
            
            vistaPasajero.identificacionPasajero.setText("");
            vistaPasajero.edadPasajero.setText("");
            vistaPasajero.nombrePasajero.setText("");
            vistaPasajero.generoPasajero.setText("");
        }
    }
    
}

