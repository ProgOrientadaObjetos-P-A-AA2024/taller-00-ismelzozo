/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Demo002 {
    /**
     * @param args the command line arguments
    
     */
    // como primer lugar para impotar lo que seria el mensaje con su respectivo paquete para despues 
    public static void main(String[] args) {
        String cad = Mensaje.obtenerMensaje();
        int habitantes = Informacion.obtenerHabitantes();
        String cadenafinal = String.format("%s con %d\n", cad,
                habitantes);
        // usar printf;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 5 para presentar" + 
                "la cadena original; caso contrario se presentara en " + 
                "mayusculas");
        int valor = sc.nextInt();
        
        if(valor >=1 && valor <=5){
            System.out.printf("%s\n", cadenafinal);
        } else {
            System.out.printf("%s\n", cadenafinal.toUpperCase());
        }
    }    
}
