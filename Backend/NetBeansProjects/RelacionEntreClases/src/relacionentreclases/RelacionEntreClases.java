/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package relacionentreclases;

/**
 *
 * @author Criss Candioti
 */
public class RelacionEntreClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Documento dni = new Documento("Criss", 37685390);
     Persona n1 = new Persona("Cristian", "Candiotio", dni);
     n1.setDocumento(dni);
        System.out.println(n1.getDocumento());
    }
    
}
