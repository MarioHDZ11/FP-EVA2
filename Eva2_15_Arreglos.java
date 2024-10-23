/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_15_arreglos;

/**
 *
 * @author invitado
 */
public class Eva2_15_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] diasSemana = new String[7];
        diasSemana[0] = "Domingo";
        diasSemana[1] = "Lunes";
        diasSemana[2] = "Martes";
        diasSemana[3] = "Miercoles";
        diasSemana[4] = "Jueves";
        diasSemana[5] = "Viernes";
        diasSemana[6] = "Sabado";
        
        for(int i = 0; i < diasSemana.length; i++){
            System.out.println(diasSemana[i]);
        }
    }
    
}
