/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double precio_original, precio_des, precioFinal;
        
        System.out.println("introduce el precio del articulo");
        precio_original = input.nextDouble();
        
        precio_des = precio_original * 0.15;
        precioFinal = precio_original - precio_des;
        
        System.out.print("Precio final con 15% de descuento: ");
        System.out.println(precioFinal);

        
        
        // TODO code application logic here
    }
    
}
