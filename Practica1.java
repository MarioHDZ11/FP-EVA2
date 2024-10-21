/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Tex;
        int Num;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Introduce tu texto:");
        Tex = cap.nextLine();
        System.out.println("¿Cuantas veces se repite?");
        Num = cap.nextInt();
        
        int resu = 0;
        for(int i =1; i <= Num; i++){
            resu = resu + Num;
            System.out.print(Tex + " -");
        }
    }

}
    
