/*

 */
package ejercicioextraherencia1;

/**
 *
 * @author Criss Candioti
 */
public class Barco {

    protected int matricula;
    protected int esloraMetros;
    protected int añoFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int esloraMetros, int añoFabricacion) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEsloraMetros() {
        return esloraMetros;
    }

    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco: " + "Matricula: " + matricula + ", Metros de Eslora:" + esloraMetros + ", Año de Fabricacion: " + añoFabricacion ;
    }

    public int moduloBarco() {
        return 10 * this.getEsloraMetros();
    }

}
