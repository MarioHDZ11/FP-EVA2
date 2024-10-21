/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg6;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Practica6 {

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
        System.out.println("");
        
        for(int i = Num; i >= 1; i--){
            for(int y = Num; y >= Num - i + 1; y--){
                System.out.print(y);
            }  
            System.out.println("");
        }
    }
    
}
