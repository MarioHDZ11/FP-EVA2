/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_validar_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva2_10_Validar_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner cap = new Scanner(System.in);
        while(true){
        System.out.println("Numero correspondiente al dia (1 - 7):");
        dia = cap.nextInt();
        if (dia >= 1 && dia <= 7)
            break;
        }
                switch(dia){
            case 1:
                System.out.println("Lunes");
                break; // Ultima instruccion - Fin del caso
            case 2:
                System.out.println("Martes");
                break; // Ultima instruccion - Fin del caso
            case 3:
                System.out.println("Miercoles");
                break; // Ultima instruccion - Fin del caso
            case 4:
                System.out.println("Jueves");
                break; // Ultima instruccion - Fin del caso
            case 5:
                System.out.println("Viernes");
                break; // Ultima instruccion - Fin del caso
            case 6:
                System.out.println("Sabado");
                break; // Ultima instruccion - Fin del caso
            case 7:
                System.out.println("Domingo");
                break; // Ultima instruccion - Fin del caso


                }
    }
    
}
