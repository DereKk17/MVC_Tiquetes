/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.dto.Piloto;
import Modelo.dao.PilotoDao;
import Vista.VistaRegistroPilotos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author derekmac
 */
public class ControladorRegistroPiloto implements ActionListener {
    
    private VistaRegistroPilotos vistaPiloto;
    private PilotoDao modelo;

    public ControladorRegistroPiloto(VistaRegistroPilotos vistaPiloto, PilotoDao modelo) {
        this.vistaPiloto = vistaPiloto;
        this.modelo = modelo;
        this.vistaPiloto.botonRegistroPiloto.addActionListener(this);
        this.vistaPiloto.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vistaPiloto.botonRegistroPiloto)){
            
            Piloto pilotoNuevo = new Piloto();
            pilotoNuevo.setNombre(this.vistaPiloto.nombrePiloto.getText());
            pilotoNuevo.setHrsVuelo(Integer.valueOf(this.vistaPiloto.hrsVuelo.getText()));
            
            if(!modelo.registrarPiloto(pilotoNuevo)){
                JOptionPane.showMessageDialog(null, "hubo un error en el registro, vuelva a intentarlo");
            }
            else{
                JOptionPane.showMessageDialog(null, "El Registro del Piloto Fue exitosos");
            }
            
            vistaPiloto.nombrePiloto.setText("");
            vistaPiloto.hrsVuelo.setText("");
        }
    }
    
}

