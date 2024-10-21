/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numx, numy;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero:");
        numx = cap.nextInt();
        System.out.println("Introduce el segundo numero:");
        numy = cap.nextInt();
        System.out.println("");
        

        for(int i = numx; i <= numy; i++){
            System.out.println( i );
        }
        System.out.println("");
        for(int o = numy; o >= numx; o--){
            System.out.println( o );

        }
             if(numy < numx){
                System.out.println("Asignacion de numeros NO valida");
}
    }

}
