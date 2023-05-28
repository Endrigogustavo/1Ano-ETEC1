/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuadawhile;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class While {
      public static Scanner teclado = new Scanner(System.in);
    public static int x, cont, res;
    public static void main(String args[])
    {
        System.out.println("Digite um valor de 1 à 10");
        x = teclado.nextInt();
        if (x>=1 && x<=10){
             cont = 0;
              while (cont <=10){
                res = x*cont;
                System.out.println(x + " * " + cont + " = " + res);
                cont++;
                
            }
        } else{
            System.out.println("[ERRO] Valor inválido");
        }
        
    }

}
