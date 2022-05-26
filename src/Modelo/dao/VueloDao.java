/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;

import Modelo.dto.Vuelo;
import java.util.ArrayList;

/**
 *
 * @author derekmac
 */
public class VueloDao {
    public ArrayList<Vuelo> listaVuelos;

    public VueloDao(ArrayList<Vuelo> listaVuelos) {
        this.listaVuelos = new ArrayList();
    }
    
    public Vuelo buscarVuelo(int codigo){
        Vuelo vuelo = null;
        for(Vuelo s : listaVuelos){
           if(s.getCodigo() == codigo){
              vuelo = s;
              break;
           }
        }
        return vuelo;
    }
    
    public ArrayList<Vuelo> vuelos(){
        return this.listaVuelos;
    }
    
}
