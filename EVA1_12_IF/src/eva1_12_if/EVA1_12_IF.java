/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int calificacion;

        System.out.println("Introduzca la calificacion");
        calificacion = input.nextInt();
        if (calificacion >= 70) {
            System.out.println("Usted si acredita, aprobo");
        } else {
            System.out.println("Usted no acredita, reprobo");
        }
    }
    
}