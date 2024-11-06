/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conversion.NotacionConversion;
import interfaz.Compilador;
import java.awt.event.ActionEvent;

/**
 *
 * @author franc
 */
public class Controlador {
    private Compilador interfaz;
    private NotacionConversion conversion;
    public Controlador(Compilador interfaz){
        this.interfaz = interfaz;
        this.conversion = new NotacionConversion();
        
         this.interfaz.getBotonCompilar().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirBotonActionPerformed(evt);
            }} );
    }
    public void convertirBotonActionPerformed(ActionEvent e){
        String text = this.interfaz.getInfija().getText();
        String infijoApostfijo = this.conversion.infijoAPostfijo(text);
        String infijoAprefijo = this.conversion.infijoAPrefijo(text);
        this.interfaz.getPostfija().setText(infijoApostfijo);
        this.interfaz.getPrefija().setText(infijoAprefijo);
//        this.interfaz.getPostfija().setText(infijoApostfijo);
    }
}
