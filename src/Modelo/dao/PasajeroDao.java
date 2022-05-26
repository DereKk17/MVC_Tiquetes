/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;

import Modelo.dto.Pasajero;
import java.util.ArrayList;

/**
 *
 * @author derekmac
 */
public class PasajeroDao {
    
    public static final ArrayList<Pasajero> listaPasajeros = new ArrayList();

    public PasajeroDao() {
    }

    
    public boolean registrarPasajero(Pasajero pasajero){
        return listaPasajeros.add(pasajero);
    }
    
    public boolean verificarPasajero(int id){
        Pasajero pasajero = null;
        for(Pasajero s : listaPasajeros){
           if(s.getId() == id){
              pasajero = s;
              break;
           }
        }
        return true; 
    }
    
    public Pasajero consultarPasajero(int id){
         Pasajero pasajero = null;
        for(Pasajero s : listaPasajeros){
           if(s.getId() == id){
              pasajero = s;
              break;
           }
        }
        return pasajero; 
    }
   
     
    public static ArrayList<Pasajero> consultarPasajeros(){
        return PasajeroDao.listaPasajeros;
    }
    
}
