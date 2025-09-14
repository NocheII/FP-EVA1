/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_19_ANTRO {
    final static String EDAD = "18";
    final static String CREDENCIAL = "Si";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String edad, credencial;
        
        System.out.println ("tienes credencial? ");
        credencial = input.nextLine();
        
        if (credencial.equals(CREDENCIAL)){
            System.out.println ("cuantos años tienes? ");
            edad = input.nextLine();
            if (edad.equals(EDAD)){ 
                System.out.println ("puedes pasar");
            }else{
                System.out.println ("No puedes pasar");
            }
        }else{
            System.out.println ("No puedes pasar");
        }
        // TODO code application logic here
    }
    
}
