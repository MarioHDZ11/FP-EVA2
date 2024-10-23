/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_18_Busqueda_lineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = {70, 56, 25, 74, 11};
        int valor,  pos = -1;
        Scanner cap = new Scanner(System.in);
        System.out.println("Valor a buscar:");
        valor = cap.nextInt();
        
        for (int i = 0; i < datos.length; i++){
            if(valor == datos[i]){
                //regresar la posicion
                pos = i;
                //detener el ciclo
                break;
            }
        }
        if(pos == -1)
            System.out.println("Valor no encontrado!!");
        else 
            System.out.println("El valor esta en la posicion " + pos);
    }
    
}
