/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ano;

import javax.swing.*;

public class Ano {

   

    public static void main(String[] args) {
        int a50 = 2050, a22 = 0, i22 = 0, i50 = 0, id = 0;
        
        a22 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento"));
        
        
       
        
        i50 = a50 - id;
        i22 = a22 - id;
        
        JOptionPane.showMessageDialog(null,"sua idade em 2050 é "+i50+ " e sua idade atual é "+i22);
        
        
        
        
        
        
        
                
              
        
        
        
    }
}
