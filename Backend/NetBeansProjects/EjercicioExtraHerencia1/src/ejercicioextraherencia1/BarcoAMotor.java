/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextraherencia1;

/**
 *
 * @author Criss Candioti
 */
public class BarcoAMotor extends Barco {

    private int PotenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int matricula, int esloraMetros, int añoFabricacion, int PotenciaCV) {
        super(matricula, esloraMetros, añoFabricacion);
        this.PotenciaCV = PotenciaCV;
    }

    public int getPotenciaCV() {
        return PotenciaCV;
    }

    public void setPotenciaCV(int PotenciaCV) {
        this.PotenciaCV = PotenciaCV;
    }
 
    @Override
    public String toString() {
        return "Barco A Motor: " + "Matricula: " + matricula + ", Metros de Eslora:" + esloraMetros + ", Año de Fabricacion: " + añoFabricacion + ", Potencia CV: " + PotenciaCV ;
    }

    @Override
    public int moduloBarco() {
        return super.moduloBarco() + this.getPotenciaCV(); //To change body of generated methods, choose Tools | Templates.
    }
}
