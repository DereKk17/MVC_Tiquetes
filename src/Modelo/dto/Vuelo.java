/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dto;

import java.util.List;

/**
 *
 * @author derekmac
 */
public class Vuelo {
    
    private int codigo;
    private String salida;
    private String destino;
    private Piloto datosPiloto;
    private int asientos;
    private List<Pasajero> listaPasajeros;
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Piloto getDatosPiloto() {
        return datosPiloto;
    }

    public void setDatosPiloto(Piloto datosPiloto) {
        this.datosPiloto = datosPiloto;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(List<Pasajero> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    @Override
    public String toString() {
        return  codigo + salida + destino + datosPiloto + asientos + listaPasajeros;
    }
    
    
    
    
}
