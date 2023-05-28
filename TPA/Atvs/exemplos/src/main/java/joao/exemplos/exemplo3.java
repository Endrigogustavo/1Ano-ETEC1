/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joao.exemplos;

/**
 *
 * @author endri
 */
public class exemplo3 {
    public static void main(String[] args) {
        String str = "isto é uma string do java";
        String xyz = new String("isto é uma string do java");
        //maneira errada criada de comparar string, portanto dará diferente
        if (str==xyz)
            System.out.println("igual");
            
        else
            System.out.println("diferente");
        //maneira certa de comparar string
        if (str.equals(xyz)) 
        System.out.println("Tamanho: "+ str.length());
        System.out.println("Substring: "+ str.substring(0,10));
        System.out.println("caracter na posicao 5: "+ str.charAt(5));
        //outros metodos
        //quebra ao encontrar espaco
        String palavras[]=str.split("");
        System.out.println("palavra: "+ palavras [0]); 
        System.out.println("palavra: "+ palavras [1]);
        System.out.println("palavra: "+ palavras [2]); 
        //index
        int i = str.indexOf("uma");
                System.out.println("indice "+ i); //o indice conta a partir do 0
                boolean teste =(str.startsWith("ola")|| str.endsWith("mundo"));
                System.out.println("resultado "+ teste);
                //eliminar espaços vazios no inicio e fim
                str=str.trim();
                System.out.println(str);
                //substitui caracteres
                  str=str.replace('a', '@');
                System.out.println(str);
                //substitui palavras
                  str=str.replaceAll("string","cadeia de caracteres");
                System.out.println(str);
                
                

    }
    
}
