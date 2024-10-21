/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg5;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int Num;
        
        System.out.println("Introduce el Numero:");
        Num = cap.nextInt();
        
        System.out.println("");
       
        for(int i = 1; i <= Num; i++){
            for(int y = Num; y >= Num - i + 1; y--){
                System.out.print(y);
            }
            System.out.println("");
        }
        
    }
    
}
