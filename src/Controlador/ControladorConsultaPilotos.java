/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.dao.PilotoDao;
import Modelo.dto.Piloto;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Vista.VistaConsultaPiloto;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author derekmac
 */
public class ControladorConsultaPilotos implements ActionListener {
    private VistaConsultaPiloto vista;
    private PilotoDao modelo;
    private DefaultTableModel modelotabla;

    public ControladorConsultaPilotos(VistaConsultaPiloto vista, PilotoDao modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelotabla = (DefaultTableModel) this.vista.jTable1.getModel();
        this.vista.botonConsultaPilotos.addActionListener(this);
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.vista.botonConsultaPilotos)){
           ArrayList<Piloto> listaPilotos= modelo.contultarPilotos();
            int filas = modelotabla.getRowCount();
            
            for (int i=0;filas>i;i++){
                modelotabla.removeRow(0);
            }
            for(Piloto piloto :listaPilotos){
                Object fila[] = {piloto.getNombre(), piloto.getHrsVuelo()};
                modelotabla.addRow(fila);
            }
        }
    }
    }
