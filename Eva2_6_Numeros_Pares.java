/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_6_Numeros_Pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner cap = new Scanner(System.in);
        int numx , numy;
        System.out.println("Inicio:");
        numx = cap.nextInt();
        System.out.println("FIn:");
        numy = cap.nextInt();
        
        for(int i = numx; i <= numy; i++){
            int mod = i % 2; //Residuo de la division
            if(mod != 0) //Verdad --> sea impar, para detener la impresion  
                continue;
                    System.out.print(i +" - ");
        }

    }
    
}
