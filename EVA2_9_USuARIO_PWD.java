/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_9_USuARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner cap = new Scanner(System.in);
        
        String User;
        String Contra;
        do{

        System.out.println("Usuario:");
        User = cap.nextLine();
        System.out.println("Contraseña:");
        Contra = cap.nextLine();
        }while(!(Contra.equals("admin") && User.equals("admin"))); //se añade un Not (!) para negar el resultado
        System.out.println("Acseso consedido");
    }
    
}
