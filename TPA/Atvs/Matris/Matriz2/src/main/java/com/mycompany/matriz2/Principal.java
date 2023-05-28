/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriz2;

/**
 *
 * @author dti
 */
public class Principal {
    public static  String matTexto[][] = {{"joao"} , {"maria"} , {"pedro"} , {"paula"} , {"ana"}};
    public static  Matriz matriz = new Matriz();
    public static void main(String[] args) {
        matriz.exibirMatriz(matTexto);
    }
    
}
