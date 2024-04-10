/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete4.Palabra;
import paquete5.Dato;
import paquete1.Mensaje;
/**
 *
 * @author reroes
 */
public class Demo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad = Palabra.obtenerPalabra();
        int num = Dato.obtenerNumeroHombres();
        
        
        System.out.println(cad+ Mensaje + num);
        // usar printf;
    }
    
}
