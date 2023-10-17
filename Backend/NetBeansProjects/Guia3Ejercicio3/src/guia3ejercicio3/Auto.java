package guia3ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Auto {

    public static double cargaInicialCombustible = 50;
    private String color;
    private String patente;
    private Rueda cubierta1;
    private Rueda cubierta2;
    private Rueda cubierta3;
    private Rueda cubierta4;

    public Auto() {
    }

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Rueda getCubierta1() {
        return cubierta1;
    }

    public void setCubierta1(Rueda cubierta1) {
        this.cubierta1 = cubierta1;
    }

    public Rueda getCubierta2() {
        return cubierta2;
    }

    public void setCubierta2(Rueda cubierta2) {
        this.cubierta2 = cubierta2;
    }

    public Rueda getCubierta3() {
        return cubierta3;
    }

    public void setCubierta3(Rueda cubierta3) {
        this.cubierta3 = cubierta3;
    }

    public Rueda getCubierta4() {
        return cubierta4;
    }

    public void setCubierta4(Rueda cubierta4) {
        this.cubierta4 = cubierta4;
    }

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", patente=" + patente + ", cubierta1=" + cubierta1 + ", cubierta2=" + cubierta2 + ", cubierta3=" + cubierta3 + ", cubierta4=" + cubierta4 + '}';
    }

    public void movimientos() {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opcion");
            String respuesta = leer.nextLine();

            switch (respuesta) {
                case "AVANZAR":
                    System.out.println("¿Cuanto deseas que avance?");
                    double avance = leer.nextDouble();
                    double avance2 = (avance * 1) / 10;
                    cargaInicialCombustible = cargaInicialCombustible - avance2;
                    System.out.println("El auto avanzo esta cantidad de metros: " + avance + " y le quedo de combustible: " + cargaInicialCombustible);
                    break;

                case "RETROCEDER":
                    System.out.println("¿Cuanto deseas que retroceda?");
                    double retroceso = leer.nextDouble();
                    double retroceso2 = (retroceso * 1) / 10;
                    cargaInicialCombustible = cargaInicialCombustible - retroceso2;
                    System.out.println("El auto avanzo esta cantidad de metros: " + retroceso + " y le quedo de combustible: " + cargaInicialCombustible);
                    break;

                case "LLENAR TANQUE":
                    if (cargaInicialCombustible == 50) {
                        System.out.println("El tanque esta lleno");
                    } else {
                        System.out.println("Ahora cargaremos el tanque");
                        cargaInicialCombustible = 50;
                    }
                    break;

                case "APAGAR MOTOR":
                    System.out.println("El auto quedo con esta cantidad de combustible: " + cargaInicialCombustible);
                    return;
                default:
                    System.out.println("Ingrese una opcion valida");
            }

        }
    }

    public void neumaticos(Rueda cubierta1, Rueda cubierta2, Rueda cubierta3, Rueda cubierta4) {
        Scanner leer = new Scanner(System.in);

        while (true) {
            String respuesta = leer.nextLine();
            switch (respuesta) {
                case "INFLAR":

                    if (this.cubierta1.getPresion() == 28.0 && this.cubierta2.getPresion() == 28.0 && this.cubierta3.getPresion() == 28.0 && this.cubierta4.getPresion() == 28.0) {
                        System.out.println("Las cubiertas estan en su maxima presion");
                        break;
                    } else {
                        System.out.println("Cargaremos a su maxima capacidad la presion de las cubiertas");
                        this.cubierta1.setPresion(28);
                        this.cubierta2.setPresion(28);
                        this.cubierta3.setPresion(28);
                        this.cubierta4.setPresion(28);
                        break;
                    }

                case "PINCHAR":
                    this.cubierta1.setPresion(1.0);
                    this.cubierta2.setPresion(1.0);
                    this.cubierta3.setPresion(1.0);
                    this.cubierta4.setPresion(1.0);
                    System.out.println("Las cubiertas se pincharon, ahora tienen una presion de: " + cubierta1.getPresion() + "PSI");
                    break;

                case "DESINFLAR":
                    if (this.cubierta1.getPresion() == 1.0 && this.cubierta2.getPresion() == 1.0 && this.cubierta3.getPresion() == 1.0 && this.cubierta4.getPresion() == 1.0) {
                        System.out.println("Las cubiertas estan en su presion minima");
                    } else {
                        System.out.println("Reducimos la presion de la rueda");
                        this.cubierta1.setPresion(cubierta1.getPresion() - 0.5);
                        this.cubierta2.setPresion(cubierta2.getPresion() - 0.5);
                        this.cubierta3.setPresion(cubierta3.getPresion() - 0.5);
                        this.cubierta4.setPresion(cubierta4.getPresion() - 0.5);
                        System.out.println("El estado de la cubierta es:" + this.cubierta1.getPresion());
                        break;
                    }

                case "SALIR":
                    return;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }

    }
}
