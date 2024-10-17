/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_while;

/**
 *
 * @author invitado
 */
public class Eva2_7_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IMprimir los numeros del 1 al 10       
        //While -->
        //do...while -->
        //puede llegar a repetirse de manera indefinida
        int val = 1;
        while(val <=10){ //while--> mientras (esto sea verdad)(repito esto)
              System.out.print(val + " - ");   
              val++;
        }
        System.out.println("");
        val = 1;
        do{
            System.out.print(val + " - ");
            val++;
        }while(val <= 10); // repetir {instrucciones} Mientras {Esto se cumpla}
        
    }
    
}
