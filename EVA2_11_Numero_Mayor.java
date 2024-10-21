/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_11_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Num;
        int numx = 0;  
        Scanner cap = new Scanner(System.in);
        
        while(true){
            System.out.println("Introduce el Numero:");
            Num = cap.nextInt();
            
            if (Num < 0) {
                break; 
            }
            if (Num > numx) {
                numx = Num;  
            }
        }
        System.out.println("El número mayor es: " + numx);         
    }
}
