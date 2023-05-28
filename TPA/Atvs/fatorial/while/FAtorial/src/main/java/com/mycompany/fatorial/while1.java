/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fatorial;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class while1 {
       public static Scanner teclado = new Scanner(System.in);
    public static int x, cont, valor, res;
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        x = teclado.nextInt();
        valor = x;
            cont = x-1;
            do{
               x = x*cont;
                cont--;
            }
            while (cont>=1);
            System.out.println(valor + "! = " + x);
            
        }
    
}
