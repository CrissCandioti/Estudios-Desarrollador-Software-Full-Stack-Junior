/*
Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado;
 */
package guia3ejercicio2b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Kiosco {

    private String nombre;
    private int direccion;
    private int cuit;
    private List<Empleado> empleados;
    private List<Empleado> empleadosContratados;

    public Kiosco() {
    }

    public Kiosco(String nombre, int direccion, int cuit) {
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

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleadosContratados() {
        return empleadosContratados;
    }

    public void setEmpleadosContratados(List<Empleado> empleadosContratados) {
        this.empleadosContratados = empleadosContratados;
    }

    @Override
    public String toString() {
        return "Kiosco{" + "nombre=" + nombre + ", direccion=" + direccion + ", cuit=" + cuit + ", empleados=" + empleados + ", empleadosContratados=" + empleadosContratados + '}';
    }

    public void contratos(ArrayList<Empleado> empleados) {
        ArrayList<Empleado> contrato = new ArrayList();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos");
        System.out.println("Ahora contrataremos");

        for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i));
            System.out.println("Desea contratarlo?");
            String respuesta = leer.nextLine();
            if ("si".equals(respuesta)) {
                System.out.println("Perfecto ahora lo registraremos");
                contrato.add(empleados.get(i));
            } else {
                System.out.println("Seguiremos con el siguiente empleado");
            }

        }
        this.empleadosContratados = contrato;
        System.out.println(this.empleadosContratados);
    }

    public void empleadoAntiguo() {
        System.out.println("El empleado mas viejo es: ");
        Empleado aux = this.empleadosContratados.get(0);
        
        for (int i = 0; i < this.empleadosContratados.size(); i++) {
            if (aux.getFechaDeIngreso().isAfter(empleadosContratados.get(i).getFechaDeIngreso())) {
                aux = this.empleadosContratados.get(i);
            }
        }
        System.out.println(aux);
    }
}
