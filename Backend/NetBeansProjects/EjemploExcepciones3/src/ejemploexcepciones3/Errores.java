/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones3;

/**
 *
 * @author Criss Candioti
 */
public class Errores extends Exception {

    /**
     * Creates a new instance of <code>Errores</code> without detail message.
     */
    public Errores() {
    }

    /**
     * Constructs an instance of <code>Errores</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public Errores(String msg) {
        super(msg);
    }
}
