/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.dao.VueloDao;
import Modelo.dto.Vuelo;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import Vista.VistaConsultaVuelos;

/**
 *
 * @author derekmac
 */
public class ControladorConsultaVuelos implements ActionListener{
    private VistaConsultaVuelos vista;
    private VueloDao modelo;
    private DefaultTableModel modelotabla;
    
    public ControladorConsultaVuelos(VistaConsultaVuelos vista) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelotabla = (DefaultTableModel) this.vista.jTable1.getModel();
        this.vista.butonConsultaVuelos.addActionListener(this);
        this.vista.setVisible(true);

    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.butonConsultaVuelos)){
            ArrayList<Vuelo> listaVuelos= modelo.listaVuelos;
            int filas = modelotabla.getRowCount();
            
            for (int i=0;filas>i;i++){
                modelotabla.removeRow(0);
            }
            for(Vuelo vuelo :listaVuelos){
                Object fila[] = {vuelo.getCodigo(), vuelo.getSalida(), vuelo.getDestino(),vuelo.getDatosPiloto(),vuelo.getAsientos()};
                modelotabla.addRow(fila);
             }
            
        }
    }

    
}
