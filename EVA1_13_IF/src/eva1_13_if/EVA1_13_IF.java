/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;

        System.out.println("Introduzca su edad");
        edad = input.nextInt();
        if (edad >= 18) {
            System.out.println("Usted si puede comparar alcohol");
        } else {
            System.out.println("Usted no se le permite comprar alcohol, es menor de edad");
        }
    }
    
}
