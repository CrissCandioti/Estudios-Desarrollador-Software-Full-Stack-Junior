package ejemplopoo.Identidad;

public class Mascota {

    public String nombre;
    public int edad;
    public String apodo;
    private int dni;

    public Mascota(String nombre, int edad, String apodo, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
        this.dni = dni;
    }

    public void setdni(int dni) {
        this.dni = dni;
    }

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

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
