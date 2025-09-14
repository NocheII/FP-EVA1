/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Introduzca el primer numero");
        numero1 = input.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        numero2 = input.nextInt();
        
        if (numero1 > numero2) {
            System.out.print("el: ");
            System.out.print(numero1);
            System.out.println(" es mas grande");
        } else {
            if (numero1 < numero2) {
            System.out.print("el: ");
            System.out.print(numero2);
            System.out.println(" es mas grande");
            } else {
            System.out.println("Los dos son iguales");
            }
        }
    }
}
