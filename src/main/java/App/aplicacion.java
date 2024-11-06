/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import controlador.Controlador;
import interfaz.Compilador;
import javax.swing.JFrame;

/**
 *
 * @author franc
 */
public class aplicacion {
    public static void main(String args[]){
        Compilador comp = new Compilador();
        Controlador control = new Controlador(comp);
        comp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comp.setVisible(true);
    }
}
