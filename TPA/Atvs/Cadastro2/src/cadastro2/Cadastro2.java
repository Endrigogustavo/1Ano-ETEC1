/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastro2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Cadastro2 {

     //utiliza para importar a clase scanner
    public static Scanner teclado = new Scanner(System.in);
    
    //variaveis
    public static String nome;
    public static int idade;
    public static float altura;
    public static boolean paulis;
  
    
 public static void main(String[] args)
    {
       
            
       System.out.println("seja bem vindo a parte de cadastro");
       System.out.println("Para começar..."); 
       System.out.println("----------------------------"); 
       
      try {
             System.out.println("Digite o seu nome: ");
       nome = teclado.nextLine();
        System.out.println("----------------------------");
            
        }
        catch (InputMismatchException e1)
        {
            System.out.println("Um erro ocorreu ao armazenamento o nome (tipo de dados) :"+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
               System.out.println("Um erro ocorreu ao armazenamento nome (varial nula) : " +e2.getMessage());
               System.out.println("Tente novamente");
               System.exit(0);
        }  
      
        
        
        try {
             System.out.println("agora digite a sua idade");
             idade = teclado.nextInt();
             System.out.println("----------------------------");
            
        }
        catch (InputMismatchException e1)
        {
            System.out.println("Um erro ocorreu ao armazenamento a idade (tipo de dados) :"+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
               System.out.println("Um erro ocorreu ao armazenamento a idade (varial nula) : " +e2.getMessage());
               System.out.println("Tente novamente");
               System.exit(0);
        }
      
        
       
        try {
            System.out.println("Esta quase acabando, agora digite a sua Altura utilizando a virgula ");     
            altura = teclado.nextFloat();
            System.out.println("----------------------------");
            
        }
        catch (InputMismatchException e1)
        {
            System.out.println("Um erro ocorreu ao armazenamento a altura (tipo de dados) :"+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
               System.out.println("Um erro ocorreu ao armazenamento a altura (varial nula) : " +e2.getMessage());
               System.out.println("Tente novamente");
               System.exit(0);
        }
        
      
        try {
            System.out.println("E por ultimo, você é paulistano? Digite true para sim e false para não ");      
            paulis = teclado.nextBoolean();
            System.out.println("----------------------------");
            System.out.println("============================");
       
        }
        catch (InputMismatchException e1)
        {
            System.out.println("Um erro ocorreu ao armazenamento se você é Paulistano (tipo de dados) :"+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
        }
        catch (NullPointerException e2)
        {
               System.out.println("Um erro ocorreu ao armazenamento se você é Paulistano (varial nula) : " +e2.getMessage());
               System.out.println("Tente novamente");
               System.exit(0);
        }
        
       System.out.println("Seu nome é: " +nome);
       System.out.println("----------------------------");
       System.out.println("Sua idade é: " +idade);
       System.out.println("----------------------------");
       System.out.println("Sua altura é: " +altura);  
       System.out.println("----------------------------");
       System.out.println("Paulista: " +paulis);
       System.out.println("----------------------------");
       System.out.println("============================");
        
       System.out.println("Dados cadastrados com sucesso!!! ");
       System.out.println("obrigado pela preferencia");
    } 
 
    
    
}
