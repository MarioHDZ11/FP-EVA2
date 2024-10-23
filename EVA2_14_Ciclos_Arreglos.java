/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_14_ciclos_arreglos;

/**
 *
 * @author invitado
 */
public class EVA2_14_Ciclos_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato, valores[]; // (dato) es una variable de tipo enterro// (valores) es un arreglo
        int[] datos, x, y, z; // todos son arreglos
        int[] arreglo = new int[10];
        
        for(int i = 0; i < arreglo.length; i++){ // asignar valores
            arreglo[i] = (int)(Math.random() * 100);
        }
//        System.out.println(arreglo); //Solo imprime la dirreccion en memoria
                for(int i = 0; i < arreglo.length; i++){ // leer todos los valores
                    System.out.print(arreglo[i] + " - ");
        }
    }
    
}
