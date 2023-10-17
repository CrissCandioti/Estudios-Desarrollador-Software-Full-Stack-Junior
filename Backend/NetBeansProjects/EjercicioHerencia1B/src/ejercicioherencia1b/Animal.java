/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un mensaje por pantalla informando de que se alimenta. 
 */
package ejercicioherencia1b;

/**
 *
 * @author Criss Candioti
 */
abstract class Animal {

    protected String nombre;
    protected int edad;
    protected String alimento;
    protected String razaDelAnimal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRazaDelAnimal() {
        return razaDelAnimal;
    }

    public void setRazaDelAnimal(String razaDelAnimal) {
        this.razaDelAnimal = razaDelAnimal;
    }

    public void animals() {
        System.out.println("Me llamo " + this.nombre + " ,mi edad es " + this.edad + " ,me alimento de " + this.alimento + " y soy de raza " + this.razaDelAnimal);
    }
}
