/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1._11_operaciones.logicas;

/**
 *
 * @author Moren
 */
public class EVA1_11_OPERACIONESLOGICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio = 5;
        boolean resu;
        //OPERACIONES LOGICAS: COMPARACIONES
        // RESULTADOS: VERDADERO O FALSO
        resu = radio > 0;
        System.out.println("Radio (5) es mayor a cero?");
        System.out.println(resu);
        
        resu = radio < 0;
        System.out.println("Radio (5) es menor a cero?");
        System.out.println(resu);
        
        resu = radio == 0;
        System.out.println("Radio (5) es igual a cero?");
        System.out.println(resu);
        
        resu = radio != 0;
        System.out.println("Radio (5) es diferente a cero?");
        System.out.println(resu);
        
        
    }
    
}
