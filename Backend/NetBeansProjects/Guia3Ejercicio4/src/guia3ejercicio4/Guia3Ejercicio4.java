/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio4;

/**
 *
 * @author Criss Candioti
 */
public class Guia3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria celdas = new Bateria(1000);
        Robot arturito = new Robot(celdas);
        Hombre richard = new Hombre(arturito);
        //Hombre carlitox = new Hombre(arturito);
        richard.JugarConRobot(arturito);
        //carlitox.JugarConRobot(arturito);
    }
    
}
