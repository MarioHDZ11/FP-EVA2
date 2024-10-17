/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_8_Validar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia;
        Scanner cap = new Scanner(System.in);
        do{
        System.out.println("Numero correspondiente al dia (1 - 7):");
        dia = cap.nextInt();
        }while(dia < 1 || dia > 7);
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
                default: // Opcional, sin Break , Ultima seccion del Switch 
        System.out.println("Numero de dia no valido(deben ser entre el 1 - 7)");
        }
    }
    
}
