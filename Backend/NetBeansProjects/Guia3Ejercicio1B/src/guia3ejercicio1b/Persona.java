/*
la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.
 */
package guia3ejercicio1b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private List<Perro> mascotas;
    private List<Perro> mascotasAdoptadas;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public List<Perro> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Perro> mascotas) {
        this.mascotas = mascotas;
    }

    public List<Perro> getMascotasAdoptadas() {
        return mascotasAdoptadas;
    }

    public void setMascotasAdoptadas(List<Perro> mascotasAdoptadas) {
        this.mascotasAdoptadas = mascotasAdoptadas;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", mascotas=" + mascotas + ", mascotasAdoptadas=" + mascotasAdoptadas + '}';
    }

    public void adoptarPerro(List<Perro> mascotas) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Perro> adoptados = new ArrayList();
        int limite = 1;
        System.out.println("Bienvenidos a nuestra aplicacion de adopcion");
        System.out.println("Puede adoptar hasta 3 mascotas");
        for (int i = 0; i < mascotas.size(); i++) {
            System.out.println(mascotas.get(i));
            System.out.println("¿Desea adoptar? SI/NO");
            String respuesta = leer.nextLine();
            if ("SI".equals(respuesta) && limite <= 3) {
                System.out.println("Perfecto, lo asignaremos de inmediato");
                adoptados.add(mascotas.get(i));
                limite = limite + 1;
            } else if (limite > 3) {
                System.out.println("Se llego al maximo de mascotas adoptadas");
            } else {
                System.out.println("Bien pasaremos a la siguiente mascota");
            }
        }
        this.mascotasAdoptadas = adoptados;
        System.out.println("Has adoptado a estas mascotas: " + this.mascotasAdoptadas);
    }

    public void perroMasGrande() {
        Perro aux = mascotasAdoptadas.get(0);
        for (int i = 0; i < this.mascotasAdoptadas.size(); i++) {
            if (mascotasAdoptadas.get(i).getEdad() > aux.getEdad()) {
                aux = mascotasAdoptadas.get(i);
            }
        }
        System.out.println("La mascota con mayor edad es: " + aux);
    }
}
