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

    public ControladorRegistroPiloto(VistaRegistroPilotos vistaPiloto) {
        this.vistaPiloto = vistaPiloto;
        this.vistaPiloto.botonRegistroPiloto.addActionListener(this);
        this.vistaPiloto.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vistaPiloto.botonRegistroPiloto)){
            
            Piloto pilotoNuevo = new Piloto();
            pilotoNuevo.setNombre(this.vistaPiloto.nombrePiloto.getText());
            pilotoNuevo.setHrsVuelo(Integer.valueOf(this.vistaPiloto.hrsVuelo.getText()));
            
            if(PilotoDao.registrarPiloto(pilotoNuevo)){
                JOptionPane.showMessageDialog(null, "El Registro del Piloto Fue exitosos");
            }
            else{
                JOptionPane.showMessageDialog(null, "hubo un error en el registro, vuelva a intentarlo");
            }
            
            vistaPiloto.nombrePiloto.setText("");
            vistaPiloto.hrsVuelo.setText("");
        }
    }
    
}

