/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_juego_aguila_sol;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_24_JUEGO_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int usuario;
        double eleccion;
        
        System.out.println("Aguila o sello? (1/0) ");
        usuario = input.nextInt();
        eleccion = Math.random();
        
        
        if (eleccion <= 0.5){
            if (usuario >= eleccion){
                System.out.println("salio sello, ganaste ");
            }else{
                System.out.println("salio sello, perdiste ");
            }
        }else{
            if (usuario <= eleccion){
                System.out.println("salio aguila, ganaste ");
            }else{
                System.out.println("salio aguila, perdiste ");
            }
        }
        // TODO code application logic here
    }
    
}
