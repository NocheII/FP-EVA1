/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_conversiones;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_23_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int temp;
        double tempdecimal;
        tempdecimal = 24.5;
        temp = (int)tempdecimal;
        System.out.println(temp);
        
        String cade, mensaje;
        mensaje = "La temperatura es ";
        cade = mensaje + temp; // concatenacion
        System.out.println(cade);
        // TODO code application logic here
    }
    
}
