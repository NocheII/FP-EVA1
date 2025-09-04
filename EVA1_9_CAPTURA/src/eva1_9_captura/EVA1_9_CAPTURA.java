/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Moren
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String nombre;
        int edad;
        double promedio;
        

        System.out.println("Introduce tu nombre completo");
        nombre = input.nextLine();
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        System.out.println("Introduce tu promedio");
        promedio = input.nextDouble();
        System.out.println("Tus datos son");
        System.out.print("Nombre: ");
        System.out.println(nombre);
        System.out.print("Edad: ");
        System.out.println(edad);
        System.out.print("Promedio: ");
        System.out.println(promedio);
    }
    
}