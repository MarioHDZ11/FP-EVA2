/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_4_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numFac;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introdusca la base:");
        numFac = cap.nextInt();
        
        int resu = 1;
        for(int i = 1; i <= numFac; i++){
            resu = resu * i;
            

        }
            System.out.println("El factorial de el numero es:" + resu);
        
    }
    
}
