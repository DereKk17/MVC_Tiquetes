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
    public ArrayList<Pasajero> listaPasajeros;

    public PasajeroDao() {
        this.listaPasajeros = new ArrayList();
    }
    
    public boolean registrarPasajero(Pasajero pasajero){
        return listaPasajeros.add(pasajero);
    }
     
    public ArrayList<Pasajero> consultarPasajeros(){
        return this.listaPasajeros;
    }
    
}
