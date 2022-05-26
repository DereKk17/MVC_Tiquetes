/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_final;


import Vista.VistaPrin;
import Controlador.ControladorPrin;
/**
 *
 * @author derekmac
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorPrin inicio = new ControladorPrin(new VistaPrin());
    }
    
}
