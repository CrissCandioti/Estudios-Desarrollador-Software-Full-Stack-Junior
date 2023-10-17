/*
Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado
 */
package guia3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Kiosco {

    private String nombre;
    private String direccion;
    private int cuit;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    public Kiosco() {
    }

    public Kiosco(String nombre, String direccion, int cuit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }

    @Override
    public String toString() {
        return "Kiosco{" + "nombre=" + nombre + ", direccion=" + direccion + ", cuit=" + cuit + ", empleado1=" + empleado1 + ", empleado2=" + empleado2 + ", empleado3=" + empleado3 + '}';
    }

    public void contratos(Empleado empleado) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea contratar a :");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Documento: " + empleado.getDni());
        while (true) {
            String respuesta = leer.nextLine();
            switch (respuesta) {
                case "si":
                    this.empleado1 = empleado;
                    System.out.println("Perfecto, lo ingresaremos al sistema");
                    System.out.println("La fecha de ingreso es: " + empleado.fechaFormateadaDeIngreso());
                    return;
                case "no":
                    System.out.println("Me importa un carajo, contrata igual");
                default:
                    System.out.println("Ingresa bien las cosas");
            }

        }
    }

    public void contratos2(Empleado empleado) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea contratar a :");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Documento: " + empleado.getDni());
        while (true) {
            String respuesta = leer.nextLine();
            switch (respuesta) {
                case "si":
                    this.empleado2 = empleado;
                    System.out.println("Perfecto, lo ingresaremos al sistema");
                    System.out.println("La fecha de ingreso es: " + empleado.fechaFormateadaDeIngreso());
                    return;
                case "no":
                    System.out.println("Me importa un carajo, contrata igual");
                default:
                    System.out.println("Ingresa bien las cosas");
            }

        }
    }

    public void contratos3(Empleado empleado) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Desea contratar a :");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Documento: " + empleado.getDni());
        while (true) {
            String respuesta = leer.nextLine();
            switch (respuesta) {
                case "si":
                    this.empleado3 = empleado;
                    System.out.println("Perfecto, lo ingresaremos al sistema");
                    System.out.println("La fecha de ingreso es: " + empleado.fechaFormateadaDeIngreso());
                    return;
                case "no":
                    System.out.println("Me importa un carajo, contrata igual");
                default:
                    System.out.println("Ingresa bien las cosas");
            }

        }
    }

    public void mayorAntiguedad() {
        if ((this.empleado1.getFechaDeIngreso().compareTo(this.empleado2.getFechaDeIngreso()) < 0)) {
            System.out.println("El empleado " + this.empleado1.getNombre() + " ingreso recientemete");
        } else {
            System.out.println("El empleado " + this.empleado2.getNombre() + " tiene mas antiguedad");
        }
    }
}
