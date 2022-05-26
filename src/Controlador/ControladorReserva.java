/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaReserva;
import Modelo.dao.VueloDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author derekmac
 */
public class ControladorReserva implements ActionListener {
    
    private VistaReserva vistaReserva;
    private VueloDao modeloVuelo;

    public ControladorReserva(VistaReserva vistaReserva) {
        this.vistaReserva = vistaReserva;
        this.vistaReserva.codigoVuelo.addActionListener(this);
        this.vistaReserva.identificacion.addActionListener(this);
        this.vistaReserva.reservar.addActionListener(this);
        this.vistaReserva.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vistaReserva.reservar)){
            modeloVuelo.buscarVuelo(Integer.valueOf(this.vistaReserva.codigoVuelo.getText()));
        }
    }
    
}
