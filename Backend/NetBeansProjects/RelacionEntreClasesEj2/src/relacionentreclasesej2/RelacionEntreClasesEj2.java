/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionentreclasesej2;

import java.util.Scanner;

public class RelacionEntreClasesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Profesor p1 = new Profesor();
        System.out.println("Ingrese los datos del profesor");
        p1.setNombre(leer.nextLine());
        p1.setApellido(leer.nextLine());
        Curso c1 = new Curso();
        System.out.println("Ingrese los datos del curso a la cual esta enseñando el profesor");
        c1.setAño(leer.nextInt());
        c1.setDivision(leer.next().charAt(0));
        c1.setProfesor(p1);
        System.out.println("Los datos ingresados anteriormente los mostraremos mas abajo");
        System.out.println(c1); //Muestro por pantalla la instanciacion del objeto c1 con su respectivo atributo objeto profesor.        
//System.out.println(c1.getProfesor()); // Puedo mostrar unicamente los datos del atributo objeto profesor.
    }

}
