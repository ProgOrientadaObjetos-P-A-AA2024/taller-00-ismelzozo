/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Mensaje;
import paquete3.Informacion;
/**
 *
 * @author reroes
 */
public class Demo {
    /**
     * @param args the command line arguments
    
     */
    // como primer lugar para impotar lo que seria el mensaje con su respectivo paquete para despues 
    public static void main(String[] args) {
        String cad = Mensaje.obtenerMensaje();
        int habitantes = Informacion.obtenerHabitantes();
        // usar printf;
        System.err.printf("%s con %d\n", cad, habitantes);
    }   
}
