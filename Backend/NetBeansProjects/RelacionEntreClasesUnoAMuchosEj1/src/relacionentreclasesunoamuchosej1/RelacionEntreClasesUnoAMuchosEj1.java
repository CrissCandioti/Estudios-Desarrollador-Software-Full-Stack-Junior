/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionentreclasesunoamuchosej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelacionEntreClasesUnoAMuchosEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        a1.setNombre("Cristian");
        a1.setApellido("Candioti");
        a2.setNombre("Diego");
        a2.setApellido("Candioti");
        a3.setNombre("Yamila");
        a3.setApellido("Breques");
        ArrayList<Alumno> alumnos = new ArrayList();
        alumnos.add(a1);
        alumnos.add(a2);
        ArrayList<Alumno> alumnos2 = new ArrayList();
        alumnos2.add(a3);
        Curso c1 = new Curso();
        Curso c2 = new Curso();
        c1.setAño(2023);
        c1.setCurso('A');
        c1.setAlumno(alumnos);
        c2.setAño(2023);
        c2.setCurso('B');
        c2.setAlumno(alumnos2);
        System.out.println(c1);
        System.out.println(c2);
        
    }
    
}
