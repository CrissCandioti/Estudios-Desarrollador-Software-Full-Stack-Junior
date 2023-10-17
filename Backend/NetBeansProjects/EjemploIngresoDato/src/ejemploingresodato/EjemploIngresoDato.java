/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploingresodato;

import java.util.Scanner;
public class EjemploIngresoDato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Fecha num1 = new Fecha();
        Fecha num2 = new Fecha(30, 7, 1993);
        num1.setDia(7);
        num1.setMes(8);
        num1.setAño(1990);
        System.out.println(num1.calcularAños(num2));
        
    }
    
}
