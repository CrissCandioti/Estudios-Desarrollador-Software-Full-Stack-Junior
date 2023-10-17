/*
Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
el barco que lo ocupará.
 */
package ejercicioextraherencia1;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Alquiler {

    private String nombre;
    private int documentoDelCliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private String amarre;
    private Barco comun;
    private BarcoAMotor motor;
    private BarcoVeleros velero;
    private BarcoYate yate;
    private String eleccion;

    public Alquiler() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoDelCliente() {
        return documentoDelCliente;
    }

    public void setDocumentoDelCliente(int documentoDelCliente) {
        this.documentoDelCliente = documentoDelCliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getAmarre() {
        return amarre;
    }

    public void setAmarre(String amarre) {
        this.amarre = amarre;
    }

    public Barco getComun() {
        return comun;
    }

    public void setComun(Barco comun) {
        this.comun = comun;
    }

    public BarcoAMotor getMotor() {
        return motor;
    }

    public void setMotor(BarcoAMotor motor) {
        this.motor = motor;
    }

    public BarcoVeleros getVelero() {
        return velero;
    }

    public void setVelero(BarcoVeleros velero) {
        this.velero = velero;
    }

    public BarcoYate getYate() {
        return yate;
    }

    public void setYate(BarcoYate yate) {
        this.yate = yate;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    public void ingresoDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a nuestra app para alquilar barcos, proseguiremos con el ingreso de datos");
        System.out.println("Ingrese su nombre");
        this.setNombre(leer.nextLine());
        System.out.println("Ingrese su documento");
        this.setDocumentoDelCliente(leer.nextInt());
        System.out.println("Ingrese una fecha de inicio y devolucion para calcular el costo del alquiler");
        System.out.println("Ingrese una fecha de inicio (YYYY/mm/dd)");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int año = leer.nextInt();
        LocalDate fI = LocalDate.of(dia, mes, año);
        this.setFechaDeAlquiler(fI);
        System.out.println("Ingrese una fecha de devolucion estimada (YYYY,mm,dd)");
        int diaD = leer.nextInt();
        int mesD = leer.nextInt();
        int añoD = leer.nextInt();
        leer.nextLine();
        LocalDate fD = LocalDate.of(diaD, mesD, añoD);
        this.setFechaDeDevolucion(fD);
        System.out.println("Ingrese el tipo de amarre que desea (Amarres largos, Amarres de Través, Amarres de Esprín, Amarres de Codera)");
        this.setAmarre(leer.nextLine());
    }

    public void barcoElegido() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ahora continuaremos con el tipo de barco que desea alquilar");
        System.out.println("Dependiendo del tipo de barco el monto del alquiler varia");
        System.out.println("Los modelos son los siguientes:");
        System.out.println("Barco comun - Barco A Motor - Barco Velero - Barco Yate");

        while (true) {
            this.setEleccion(leer.nextLine());
            switch (eleccion) {
                case "barco comun":
                    System.out.println("Su eleccion fue la de un barco comun");
                    Barco b = new Barco(357159189, 20, 1993);
                    this.comun = b;
                    System.out.println(this.comun);
                    return;

                case "barco a motor":
                    System.out.println("Su eleccion fue un barco a motor");
                    BarcoAMotor m = new BarcoAMotor(32412698, 20, 2010, 250);
                    this.motor = m;
                    System.out.println(this.motor);
                    return;

                case "barco velero":
                    System.out.println("Su eleccion fue un barco velero");
                    BarcoVeleros v = new BarcoVeleros(148368852, 45, 2015, 4);
                    this.velero = v;
                    System.out.println(this.velero);
                    return;

                case "barco yate":
                    System.out.println("Su eleccion fue un barco yate");
                    BarcoYate y = new BarcoYate(450, 16, 1463658, 50, 2023);
                    this.yate = y;
                    System.out.println(this.yate);
                    return;

                default:
                    System.out.println("Por favor ingrese una opcion valida y escriba en minuscula");
            }
        }
    }

    public void alquilerCalculo() {
        long diasTranscurridos = DAYS.between(this.fechaDeAlquiler, this.fechaDeDevolucion);
        System.out.println("Fecha de inicio del alquiler: " + this.getFechaDeAlquiler());
        System.out.println("Fecha de devolucion: " + this.getFechaDeDevolucion());
        System.out.println("Los dias transcurridos fueron: " + diasTranscurridos);

        if ("barco comun".equals(this.getEleccion())) {
            int total = (int) (diasTranscurridos * this.comun.moduloBarco());
            System.out.println("El total a pagar por alquilar un barco comun seria: " + total);
        } else if ("barco a motor".equals(this.getEleccion())) {
            int total = (int) (diasTranscurridos * this.motor.moduloBarco());
            System.out.println("El total a pagar por alquilar un barco con motor seria: " + total);
        } else if ("barco velero".equals(this.getEleccion())) {
            int total = (int) (diasTranscurridos * this.velero.moduloBarco());
            System.out.println("El total a pagar por alquilar un barco velero seria: " + total);
        } else if ("barco yate".equals(this.getEleccion())) {
            int total = (int) (diasTranscurridos * this.yate.moduloBarco());
            System.out.println("El total a pagar por alquilar un barco del tipo yate seria: " + total);
        }

    }

    
}
