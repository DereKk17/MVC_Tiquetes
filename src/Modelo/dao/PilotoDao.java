/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;

import Modelo.dto.Piloto;
import java.util.ArrayList;

/**
 *
 * @author derekmac
 */
public class PilotoDao {
    public static ArrayList<Piloto> listaPilotos;

    public PilotoDao() {
        this.listaPilotos = new ArrayList();
    }
    
    public static boolean registrarPiloto(Piloto piloto){
        return listaPilotos.add(piloto);
    }
    
    
    public static ArrayList<Piloto> contultarPilotos(){
        return listaPilotos;
    }
    
   
    
}
