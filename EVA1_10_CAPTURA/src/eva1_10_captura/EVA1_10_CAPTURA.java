/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author Moren
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double distancia;
        double tiempo;
        double velocidad;
        
        System.out.println("Introduzca la distancia en metros: ");
        distancia = input.nextDouble();
        System.out.println("Introduzca el tiempo en segundos: ");
        tiempo = input.nextDouble();
        
        velocidad = (distancia*tiempo);
        
        System.out.print("La velocidad es de: ");
        System.out.print(velocidad);
        System.out.println(" m/s");
        
        
        
    }
    
}
