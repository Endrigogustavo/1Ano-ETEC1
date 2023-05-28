/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade24.segundoprograma;

import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    
    private String texto = "";
    
    public Util()
    {
        System.out.println("Construtor execultado...");
        
        
    }

    /**
     * @return the name
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param name the name to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void exibirTexto(){
        
        JOptionPane.showMessageDialog(null,"uhuuuu, seu primeiro programa... " + "\n"  + this.getTexto());
    }
    
    public void digitarTexto() {
        
        this.setTexto(JOptionPane.showInputDialog("Digite seu nome"));
        
    }
    
    
    
}
