/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA1_18_ACCESO {
    final static String USUARIO = "Carlos";
    final static String PSWD = "1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Usuario, Contra;
        
        System.out.println ("Usuario: ");
        Usuario = input.nextLine();
        
        System.out.println ("Contraseña: ");
        Contra = input.nextLine();
        
        if (Usuario.equals(USUARIO)){
            if (Contra.equals(PSWD)){ 
                System.out.println ("Bienvenido");
            }else{
                System.out.println ("Contraseña Incorrecta");
            }
        }else{
            System.out.println ("Usuario Incorrecto");
        }
        
        
        // TODO code application logic here
    }
    
}
