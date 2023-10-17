/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepcion9;

/**
 *
 * @author Criss Candioti
 */
public class EjercicioExcepcion9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MioException {

        try {
            EjercicioExcepcion9.letra();
        } catch (MioException e) {
            throw (e);
        }

    }

    public static void letra() throws MioException {
        String n = null;

        if (n == null) {
            throw new MioException("Error por valor nulo"); //Si se utiliza una instruccion throw se debe utilizar una instruccion throws en el metodo para indicar el tipo de excepcion que se puede producir.
        } else {
            System.out.println(n.length());
        }
    }

}
//        9. Dado el método metodoC de la clase C, indique:
//
//        a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//           Si se interrumpe el flujo del programa las sentencias que se ejecutarian son sentencia_c1 que esta fuera del try, dentro del bloque try se necesita saber donde se produce la excepcion.
//           Si se produce una excepcion en la sentencia_c2 entonces la sentencia_c3 no se ejecutaria, pasando al bloque catch con la sentencia_c4 y por ultimo el bloque finally (Recordemos que siempre se ejecuta) con la sentencia_c6.
//           Pero si se produce la excepcion en la sentencia_c3 entonces esta misma se ejecutaria pero seria la que tendria la excepcion. 
//        b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//           Si no se interrumpe el flujo del programa, es decir que no se produce ninguna excepcion entonces nuestro codigo se ejecutaria en el siguiente orden sentencia_c1, sentencia_c2, sentencia_c3, sentencia_c6.
//        c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
//           Si se produce una excepcion del tipo TuException entonces las sentencias que se ejecutaria serian sentencia_c1, sentencia_c2, sentencia_c3, sentencia_c5 y sentencia_c6.
//           class C {
//
//            void metodoC() throws TuException {
//                sentencia_c1
//                try {
//                    sentencia_c2 
//                    sentencia_c3
//                } catch (MioException e) {
//                    sentencia_c4
//                } catch (TuException e) {
//                    sentencia_c5
//                    throw (e)
//                }
//                
//                 finally
//                 sentencia_c6
//
//            }
//        }
