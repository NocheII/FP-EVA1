/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_operaciones;

/**
 *
 * @author Moren
 */
public class EVA1_21_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 2, expo = 3;
        double resu;
        resu = Math.pow(valor, expo);
        
        System.out.print("2^3 es: ");
        System.out.println(resu);
        
        //raiz cuadrada
        int valor2 = 100;
        double resu2;
        resu2= Math.sqrt(valor2);
        
        System.out.print("La raiz cuadrada de 100 es: ");
        System.out.println(resu2);
        
        //Raiz cubica
        int valor3 = 125;
        double resu3;
        resu3= Math.pow(valor3, 1.0/3.0);
        
        System.out.print("La raiz cubica de 125 es: ");
        System.out.println(resu3);
        
        //Division entre enteros
        System.out.println(7/3);
        System.out.println(7.0/3.0);
        
        int num1 =2024, num2 =4;
        int residuo;
        
        residuo = num1 % num2;
        System.out.print("2024 / 4 es: ");
        System.out.println(residuo);
        
        // TODO code application logic here
    }
    
}
