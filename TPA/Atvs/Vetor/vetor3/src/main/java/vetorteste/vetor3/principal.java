/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetorteste.vetor3;

/**
 *
 * @author dti
 */
public class principal {
    public static String vetorNome[] = {"s" , "a" , "o" , " " , "p" , "a" , "u" , "l" , "o"};
    
    public static vetor vet = new vetor();
    
    
    public static void main(String[] args)
    {
        System.out.println("Vetores...");
        vet.exibirVetorPorLetra(vetorNome);
        System.out.println("");
        vet.ordenarVetorPorLinha(vetorNome);
        System.out.println("");
        
        
    }
    
}
