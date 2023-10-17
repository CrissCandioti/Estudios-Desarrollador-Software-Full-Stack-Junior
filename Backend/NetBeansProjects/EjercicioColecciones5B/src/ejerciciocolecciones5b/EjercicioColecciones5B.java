/*
5) Un Colegio nos pide un sistema para llevar un registro de los alumnos que se encuentran
cursando actualmente. Los datos que necesita de un Alumno son: legajo, apellido, nombre y año
que cursa. El sistema debe permitir agregar alumnos al Colegio sin que se repitan, quitar alumnos
en base a su legajo, listar los alumnos ordenados alfabéticamente por su apellido y listar los
alumnos cuyos apellidos comiencen por un carácter en particular. Luego desde el método main de
una clase Test, nos piden:
 Instanciar un Colegio.
 Definir un bucle que crea un objeto Alumno pidiéndole al usuario todos sus datos y
guardándolos en el objeto Alumno. Después, ese Alumno se guarda en el Colegio usado
el método de Colegio que usted implementó y se le pregunta al usuario si quiere crear otro
Alumno o no.
 Quitar uno de los alumnos cargados.
 Listar los alumnos ordenados por apellido.
 Listar los alumnos cuyo apellido comience con la letra que el usuario ingresará por teclado.
 */
package ejerciciocolecciones5b;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioColecciones5B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio c = new Colegio();
        c.generadorDeAlumno();
        System.out.println("----------");
        c.eliminar();
        System.out.println("----------");
        c.alumnosOrdenadosPorApellido();
        System.out.println("----------");
        c.listarLosAlumnosPorLetra();
    }
}
