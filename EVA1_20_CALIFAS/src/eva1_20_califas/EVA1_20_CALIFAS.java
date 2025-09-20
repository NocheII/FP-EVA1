/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       int Calificacion;
       
       System.out.println ("Introduzca su calificacion ");
       Calificacion = input.nextInt();
       
       if ((Calificacion <= 100)&&(Calificacion >= 90)){
            System.out.println("Su calificacion es de A");
        }else if((Calificacion <= 89)&&(Calificacion >= 80)){
            System.out.println("Su calificacion es de B");
        }else if((Calificacion <= 79)&&(Calificacion >= 70)){
            System.out.println("Su calificacion es de C");
        }else if((Calificacion <= 69)&&(Calificacion >= 60)){
            System.out.println("Su calificacion es de D");
        }else if((Calificacion >= 0)&&(Calificacion <= 59)){
            System.out.println("Su calificacion es de F");
        }
          
        
    }
    
}
