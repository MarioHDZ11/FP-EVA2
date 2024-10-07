/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int calif,  sumaCalif;
        // inicializar el acomulador 
        sumaCalif = 0;
        for(int i = 1; i <=10; i++){
           System.out.println("Estuduiante # " + i);
           System.out.println("¿Cual es tu calificacion?");
        calif = cap.nextInt();
        cap.nextLine(); 
        // acomular las calificaciones 
        sumaCalif = sumaCalif + calif;
        
            System.out.println("sumaCalif =" + sumaCalif / 10 );//sumatoria
        }
        
        

    }
    
}
