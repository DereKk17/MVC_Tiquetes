
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaPrin;
import Vista.VistaRegistroPasajero;
import Vista.VistaRegistroPilotos;
import Modelo.dao.PilotoDao;
import Modelo.dao.PasajeroDao;
import Modelo.dto.Piloto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.dto.Vuelo;
import Vista.VistaConsultaPasajeros;
import Vista.VistaConsultaPiloto;
import Vista.VistaConsultaVuelos;
import Vista.VistaReserva;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author derekmac
 */
public class ControladorPrin implements ActionListener {
    
    private VistaPrin vistaPrin;

    public ControladorPrin(VistaPrin vistaPrin) {
        this.vistaPrin = vistaPrin;
        this.vistaPrin.botonRegistroPasajero.addActionListener(this);
        this.vistaPrin.botonRegistroPiloto.addActionListener(this);
        this.vistaPrin.botonRegistroVuelo.addActionListener(this);
        this.vistaPrin.botonSalir.addActionListener(this);
        
        this.vistaPrin.mConsultaPasajero.addActionListener(this);
        this.vistaPrin.mConsultaPiloto.addActionListener(this);
        this.vistaPrin.mConsultaVuelo.addActionListener(this);
        this.vistaPrin.mReserva.addActionListener(this);
        this.vistaPrin.setVisible(true);
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
      
        
        if(e.getSource().equals(this.vistaPrin.botonRegistroPasajero)){
            ControladorRegistroPasajero controlPasajero = new ControladorRegistroPasajero(new VistaRegistroPasajero(),new PasajeroDao());
        }
        else if(e.getSource().equals(this.vistaPrin.botonRegistroPiloto)){
            ControladorRegistroPiloto controlPiloto = new ControladorRegistroPiloto(new VistaRegistroPilotos(),new PilotoDao());
           
        }
        else if(e.getSource().equals(this.vistaPrin.mReserva)){
            ControladorReserva controlReserva = new ControladorReserva(new VistaReserva());
        }
        else if(e.getSource().equals(this.vistaPrin.botonRegistroVuelo)){
            if(PilotoDao.listaPilotos.isEmpty() && PasajeroDao.listaPasajeros.isEmpty()){
                 JOptionPane.showMessageDialog(null,"No hay Pilotos Registrados o Pasajeros");
            }
            else{
                Vuelo vueloNuevo = new Vuelo();                   
                vueloNuevo.setCodigo((int) (Math.random()*((10 - 1) + 1)));
                vueloNuevo.setAsientos((int) (Math.random()*((200 - 100) + 1)));
                vueloNuevo.setSalida("Colombia");
                vueloNuevo.setDestino("mexico");
                vueloNuevo.setDatosPiloto(PilotoDao.listaPilotos.get((int) (Math.random()*((PilotoDao.listaPilotos.size() - 1) + 1))));
             
                JOptionPane.showMessageDialog(null,"se creo el vuelo con exito ");               
            }
            
        }
        else if(e.getSource().equals(this.vistaPrin.mConsultaPasajero)){
            ControladorConsultaPasajeros consultapasajeros = new ControladorConsultaPasajeros(new VistaConsultaPasajeros());
            
        }
       else if(e.getSource().equals(this.vistaPrin.mConsultaPiloto)){
            ControladorConsultaPilotos consultapilotos = new ControladorConsultaPilotos(new VistaConsultaPiloto());}

       else if(e.getSource().equals(this.vistaPrin.mConsultaVuelo)){
            ControladorConsultaVuelos consultavuelos = new ControladorConsultaVuelos(new VistaConsultaVuelos());    
        }
       
        else if(e.getSource().equals(this.vistaPrin.botonSalir)){
            System.exit(0);
                   
        }
        
        
    
    }
}
