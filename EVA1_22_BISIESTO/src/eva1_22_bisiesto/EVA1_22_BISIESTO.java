/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_bisiesto;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_22_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int year, resi4, resi100,resi400; 
        System.out.println("año que quiere verificar");
        year = input.nextInt();
        resi4 = year % 4;
        resi100 = year % 100;
        resi400 = year % 400;
        
        if(resi4 == 0){
            if(resi100 == 0){
                if (resi400 == 0){
                    System.out.println("el año " + year + " 2024es bisiesto");
                }else{
                    System.out.println("el año " + year + " no es bisiesto"); 
                }
            }else{
               System.out.println("el año " + year + " es bisiesto"); 
            }
        }else{
            System.out.println("el año " + year + " no es bisiesto"); 
        }
        
        // TODO code application logic here
    }
    
}
