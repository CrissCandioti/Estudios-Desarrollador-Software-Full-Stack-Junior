/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocolecciones1;

/**
 *
 * @author Criss Candioti
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private int documento;
    private String ciudad;
    private String direccion;

    public Cliente(String nombre, String apellido, int documento, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.ciudad = ciudad;
        this.direccion = direccion;
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", ciudad=" + ciudad + ", direccion=" + direccion + '}';
    }

}
