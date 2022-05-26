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
    public static final ArrayList<Piloto> listaPilotos = new ArrayList();

    
    
    public boolean registrarPiloto(Piloto piloto){
        return listaPilotos.add(piloto);
    }
    
    
    public  ArrayList<Piloto> contultarPilotos(){
        return PilotoDao.listaPilotos;
    }
    
   
    
}
