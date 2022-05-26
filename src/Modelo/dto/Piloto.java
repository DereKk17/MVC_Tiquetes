/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dto;

/**
 *
 * @author derekmac
 */
public class Piloto {
    
    private int hrsVuelo;
    private String nombre;

    public Piloto() {
        
    }

    public int getHrsVuelo() {
        return hrsVuelo;
    }

    public void setHrsVuelo(int hrsVuelo) {
        this.hrsVuelo = hrsVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + hrsVuelo;
    }
   
    
    
}
