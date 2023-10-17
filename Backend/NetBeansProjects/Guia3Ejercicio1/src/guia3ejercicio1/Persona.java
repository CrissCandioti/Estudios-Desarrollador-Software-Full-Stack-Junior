/*
La clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.
 */
package guia3ejercicio1;

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
    private Perro canino1;
    private Perro canino2;
    private Perro canino3;

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

    public Perro getCanino1() {
        return canino1;
    }

    public void setCanino1(Perro canino1) {
        this.canino1 = canino1;
    }

    public Perro getCanino2() {
        return canino2;
    }

    public void setCanino2(Perro canino2) {
        this.canino2 = canino2;
    }

    public Perro getCanino3() {
        return canino3;
    }

    public void setCanino3(Perro canino3) {
        this.canino3 = canino3;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", canino1=" + canino1 + ", canino2=" + canino2 + ", canino3=" + canino3 + '}';
    }

    public void adoptarPerro(Perro canino1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea adoptar? SI/NO");
        String respuesta = leer.nextLine();
        if ("SI".equals(respuesta)) {
            System.out.println("Perfecto, lo asignaremos de inmediato");
            if ((this.canino1 == null) && (this.canino2 == null) && (this.canino3 == null)) {
                this.canino1 = canino1;
                System.out.println("Acabo de adoptar a :");
                System.out.println(this.canino1);
            } else if ((this.canino1 != null) && (this.canino2 == null) && (this.canino3 == null)) {
                this.canino2 = canino1;
                System.out.println("Acabo de adoptar a :");
                System.out.println(this.canino2);
            } else if ((this.canino1 != null) && (this.canino2 != null) && (this.canino3 == null)) {
                this.canino3 = canino1;
                System.out.println("Acabo de adoptar a :");
                System.out.println(this.canino3);
            } else if ((this.canino1 != null) && (this.canino2 != null) && (this.canino3 != null)) {
                System.out.println("No puede adoptar mas animales");
                System.out.println("Ya adopto a: ");
                System.out.println(this.canino1);
                System.out.println(this.canino2);
                System.out.println(this.canino3);
            }
        } else {
            System.out.println("Bien pasaremos con la siguiente mascota");
        }
    }

    public void caso(Perro canino1) {
        if (this.canino1 == null) {
            this.canino1 = canino1;
        } else if (this.canino2 == null) {
            this.canino2 = canino1;
        } else if (this.canino3 == null) {
            this.canino3 = canino1;
        }
    }

    public void perroMasGrande() {
        if ((this.canino1.getEdad() > this.canino2.getEdad()) && (this.canino1.getEdad() > this.canino3.getEdad())) {
            System.out.println("La mascota de mayo edad es :");
            System.out.println(this.canino1.getNombre());
        } else if (this.canino2.getEdad() > this.canino1.getEdad() && this.canino2.getEdad() > this.canino3.getEdad()) {
            System.out.println("La mascota de mayo edad es :");
            System.out.println(this.canino2.getNombre());
        } else if (this.canino3.getEdad() > this.canino1.getEdad() && this.canino3.getEdad() > this.canino2.getEdad()) {
            System.out.println("La mascota de mayo edad es :");
            System.out.println(this.canino3.getNombre());
        } else if ((this.canino1.getEdad() == this.canino2.getEdad()) || (this.canino1.getEdad() == this.canino3.getEdad()) || (this.canino2.getEdad() == this.canino3.getEdad())) {
            System.out.println("Tenemos mascotas que comparten la misma edad");
        }
    }
}
