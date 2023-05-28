/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuadadowhile;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class DoWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int x, cont, res;
    public static void main(String[] args) {
        System.out.println("Digite um valor de 0 à 1");
        x = teclado.nextInt();
        if (x>=1&&x<=10){    
            cont = 0;
            do{
                res = x*cont;
                System.out.println(x + " * " + cont + " = " + res);
                cont++;
            }
            while (cont <=10);
        } 
        else{
            System.out.println("[ERRO] Valor inválido");
        }
    }   
}
