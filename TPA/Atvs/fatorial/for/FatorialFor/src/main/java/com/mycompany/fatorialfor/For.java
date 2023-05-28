/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fatorialfor;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class For {
    public static Scanner teclado = new Scanner(System.in);
    public static int x, cont, valor, res;
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        x = teclado.nextInt();
        valor = x;
            
            for (cont = x-1; cont>=1; cont--){
               x = x*cont;
                
            }
            System.out.println(valor + "! = " + x);
        }
    }

