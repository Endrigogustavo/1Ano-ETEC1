//package br.edu.eteczl.padrao;

import java.util.Scanner;

public class CadastroAlunoConsole 
{
  
  private static Scanner scanner = new Scanner(System.in);
  
  private static String email = "";
  
  public static void main(String[] args) 
  {
    email = "wagnerlucca@gmail. com";
    //Se não encontrar retorna -1;
    
    System.out.println("\n\nUsuário: " + email.substring(0 ,  email.indexOf("@")));
    
    System.out.println(email.indexOf("@"));
    
    System.out.println("Domínio: " + email.substring(email.indexOf("@") , email.length()));
    
    System.out.println(email.length());
    
    System.out.println("Contém o símbolo @: " + email.contains("@"));
    
    System.out.println("Termina com .br: " + email.endsWith(".br"));
    
    System.out.println("Concatenação de texto: " + email.concat(".   br"));
    
    System.out.println("Email sem espaços em branco: " + email.trim());
    
    System.out.println("Tudo em maiúsculo: " + email.toUpperCase());
    
    System.out.println("Tudo em minúsculo: " + email.toLowerCase());
    
    System.out.println("Trocar . por *: " + email.replace("." , "*"));
    
    System.out.println("Compara com o email da Etec: " + email.equals("wagner.lucca@etec.sp.gov.br"));
  }
}