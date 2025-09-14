/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;

import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_16_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int dia_semana;
        
        System.out.println("Introduzca el numero del dia (1 al 7");
        dia_semana = input.nextInt();
        
        if (dia_semana == 1){
            System.out.println("Es Domingo");
        }else if(dia_semana == 2){
            System.out.println("Es Lunes");
        }else if(dia_semana == 3){
            System.out.println("Es Martes");
        }else if(dia_semana == 4){
            System.out.println("Es Miercoles");
        }else if(dia_semana == 5){
            System.out.println("Es Jueves");
        }else if(dia_semana == 6){
            System.out.println("Es Viernes");
        }else if(dia_semana == 7){
            System.out.println("Es Sabado");
        }else{
            System.out.println("Ese dia no existe");
        }
        
        
        
        // TODO code application logic here
    }
    
}
