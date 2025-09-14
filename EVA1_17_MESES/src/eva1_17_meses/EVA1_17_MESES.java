/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;

import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_17_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Mes;
        
        System.out.println("Introduzca el numero del mes (1 al 12");
        Mes = input.nextInt();
        
        if (Mes == 1){
            System.out.println("Es Enero");
        }else if(Mes == 2){
            System.out.println("Es Febrero");
        }else if(Mes == 3){
            System.out.println("Es Marzo");
        }else if(Mes == 4){
            System.out.println("Es Abril");
        }else if(Mes == 5){
            System.out.println("Es Mayo");
        }else if(Mes == 6){
            System.out.println("Es Junio");
        }else if(Mes == 7){
            System.out.println("Es Julio");
        }else if(Mes == 8){
            System.out.println("Es Agosto");
        }else if(Mes == 9){
            System.out.println("Es Septiempre");
        }else if(Mes == 10){
            System.out.println("Es Octubre");
        }else if(Mes == 11){
            System.out.println("Es Noviembre");
        }else if(Mes == 12){
            System.out.println("Es Diciembre");
        }else{
            System.out.println("Ese numero no es valido");
        }
        // TODO code application logic here
    }
    
}
