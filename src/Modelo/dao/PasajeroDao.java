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
    private static ArrayList<Pasajero> listaPasajeros;

    public PasajeroDao() {
        this.listaPasajeros = new ArrayList();
    }
    
    public static boolean registrarPasajero(Pasajero pasajero){
        return listaPasajeros.add(pasajero);
    }
    
}