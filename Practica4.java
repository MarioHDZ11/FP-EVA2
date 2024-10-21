/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        System.out.println("Introduce tu texto: ");
        text = scanner.nextLine();

        String voc = "";
        for (int i = 0; i < text.length(); i++) {
            char car = text.charAt(i);
            if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u' || car == 'A' || car == 'E' || car == 'I' || car == 'O' || car == 'U') {
                voc += car;
            }
        }
        System.out.println("Las vocales en el texto son: " + voc);
    }
}