/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package ejercicioejemploherencia;

/**
 *
 * @author Criss Candioti
 */
public class Animal {

    protected String nombre;
    protected int edad;
    protected String ruido;

    public Animal(String nombre, int edad, String ruido) {
        this.nombre = nombre;
        this.edad = edad;
        this.ruido = ruido;
    }

    public void mostrarNombre() {
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public void mostrarEdad() {
        System.out.println("Tengo estos añitos: " + this.edad);
    }

    public String mostrarRuido() {
        return this.ruido;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", ruido=" + ruido + '}';
    }

}
