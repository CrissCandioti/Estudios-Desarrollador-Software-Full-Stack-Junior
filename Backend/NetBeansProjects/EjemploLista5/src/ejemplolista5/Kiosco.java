/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolista5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Kiosco {

    private String nombreKiosco;
    private int cuit;
    private ArrayList<Empleado> empleados = new ArrayList();

    public Kiosco(String nombreKiosco, int cuit) {
        this.nombreKiosco = nombreKiosco;
        this.cuit = cuit;
    }

    public String getNombreKiosco() {
        return nombreKiosco;
    }

    public void setNombreKiosco(String nombreKiosco) {
        this.nombreKiosco = nombreKiosco;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Kiosco{" + "nombreKiosco=" + nombreKiosco + ", cuit=" + cuit + ", empleados=" + empleados + '}';
    }

    public Empleado crearEmpleado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre, apellido y edad del empleado");
        return new Empleado(leer.nextLine(), leer.nextLine(), leer.nextInt());
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void fabricaEmpleados(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Empleado aux = crearEmpleado();
            agregarEmpleado(aux);
        }
    }

    public void mostrarEmpleado() {
        for (Empleado aux : empleados) {
            System.out.println(aux);
        }
        System.out.println("Actualmente el kiosco tiene " + empleados.size() + " empleados");
    }

    public void modificarEmpleado(int index) {
        Empleado E = crearEmpleado();
        this.empleados.set(index, E);
    }

    public void eliminarEmpleado(int index) {
        if (index <= (this.empleados.size() - 1)) {
            System.out.println("Eliminaremos el empleado situado en ese indice");
            this.empleados.remove(index);
        } else {
            System.out.println("Nuestra lista tiene " + this.empleados.size() + " y se ingreso el numero " + index + " imposible de realizar dicha operacion");
        }
    }

}
