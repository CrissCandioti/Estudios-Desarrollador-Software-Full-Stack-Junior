/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepcion1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Criss Candioti
 */
public class Colegio {

    private String nombreInstitucion;
    private ArrayList<Persona> persona;

    public Colegio() {
    }

    public Colegio(String nombreInstitucion, ArrayList<Persona> persona) {
        this.nombreInstitucion = nombreInstitucion;
        this.persona = persona;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public ArrayList<Persona> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Persona> persona) {
        this.persona = persona;
    }

    public Persona generarPersona() {
        return new Persona("Diego", 18);
    }

    public void añadir(Persona index) throws NullPointerException {
        this.persona.add(index);
    }

    public void mostrar() throws NullPointerException {
        for (int i = 0; i < this.persona.size(); i++) {
            System.out.println(this.persona);
        }
    }
}
