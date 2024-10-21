/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduce tu texto:");
        String cade;
        cade = cap.nextLine();

        for(int i = 0; i < cade.length(); i++){
             System.out.println(cade.charAt(i));
        }
        
    }
    
}

