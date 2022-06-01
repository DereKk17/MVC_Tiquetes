/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.dao.PasajeroDao;
import Modelo.dto.Pasajero;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Vista.VistaConsultaPasajeros;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
/**
 *
 * @author derekmac
 */
public class ControladorConsultaPasajeros implements ActionListener{
    private VistaConsultaPasajeros vista;
    private PasajeroDao modelo;
    private DefaultTableModel modelotabla;
    
    

    public ControladorConsultaPasajeros(VistaConsultaPasajeros vista) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.botonConsultaPasajeros.addActionListener(this);
        this.modelotabla = (DefaultTableModel) this.vista.jTable1.getModel();
        this.vista.setVisible(true);
    }

    

    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.botonConsultaPasajeros)){
            ArrayList<Pasajero> listaPasajeros = modelo.consultarPasajeros();
            int filas = modelotabla.getRowCount();
            
            for (int i=0;filas>i;i++){
                modelotabla.removeRow(0);
            }
            for(Pasajero pasajero :listaPasajeros){
                Object fila[] = {pasajero.getNombre(), pasajero.getId(), pasajero.getGenero(), pasajero.getEdad()};
                modelotabla.addRow(fila);
            }
        }
    }
    }
