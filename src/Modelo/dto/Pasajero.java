/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dto;

/**
 *
 * @author derekmac
 */
public class Pasajero {
    
    private int edad;
    private int id;
    private String genero;
    private String nombre;

    public Pasajero(int edad, int id, String genero, String nombre) {
        this.edad = edad;
        this.id = id;
        this.genero = genero;
        this.nombre = nombre;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  edad + id + genero + nombre;
    }
    
    
    
   
}
