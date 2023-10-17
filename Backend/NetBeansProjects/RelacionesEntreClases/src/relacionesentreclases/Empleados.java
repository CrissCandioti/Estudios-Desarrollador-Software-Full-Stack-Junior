/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionesentreclases;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
class Empleados {

    private String nombre;
    private String apellido;
    private Area area;
    private String turno;
    private int edad;
    private int dni;
    private LocalDate fechaIngreso;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, Area area, String turno, int edad, int dni, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.area = area;
        this.turno = turno;
        this.edad = edad;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
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

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", area=" + area + ", turno=" + turno + ", edad=" + edad + ", dni=" + dni + ", fechaIngreso=" + fechaIngreso + '}';
    }

    public void generarEmpleado() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nom = leer.nextLine();
        System.out.println("Ingrese el apellido");
        String ape = leer.nextLine();
        System.out.println("Ingrese el area");
        System.out.println("Ingrese el sector al que pertenece (RRHH, laboratorio, seguridad y contabilidad)");
        Area a = new Area(leer.nextLine());
        System.out.println("Ingrese el turno (mañana, tarde, noche)");
        String turn = leer.nextLine();
        System.out.println("Ingrese su edad");
        int ed = leer.nextInt();
        System.out.println("Ingrese su DU");
        int du = leer.nextInt();
        System.out.println("Ingrese la fecha (YYYY/MM/DD)");
        LocalDate ingreso = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
    }

}
