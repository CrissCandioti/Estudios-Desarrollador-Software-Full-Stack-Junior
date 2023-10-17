/*
1) Un directorio telefónico posee una lista de Clientes de los que interesa conocer: dni, nombre,
apellido, ciudad y dirección. El directorio está compuesto por el número de teléfono y los datos
del Cliente (Directorio: <teléfono,Cliente> donde el teléfono no es un atributo del cliente. Cuando
agendamos un cliente al directorio telefónico lo agendamos con su número de teléfono, que es
único)
El directorio telefónico posee además las siguientes funcionalidades:
● agregarCliente(nroTel, Cliente):void  que permite registrar un nuevo cliente con su
respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.
● buscarCliente(nroTel):Cliente  que en base al nro de teléfono retorna el Cliente asociado al
mismo.
● buscarTeléfono(apellido):List  que en base a un apellido nos devuelve una lista con los nros.
de teléfono asociados a dicho apellido.
● buscarClientes(ciudad):List  que en base a una ciudad nos devuelve una lista con los
Clientes asociados a dicha ciudad.
● borrarCliente(telefono):void que en base a un nro de teléfono elimina el cliente del directorio.

Luego desde el método main de una clase Test se pide:
 Crear un directorio.
 Cargar 5 clientes al directorio a través de su método agregarCliente, con sus respectivos
nros de teléfono.
 Probar el resto los métodos que posee directorio.

Importante: Armar el modelo UML representado las clases necesarias. Implementar en java.
 */
package coleccionesejercicio1;

/**
 *
 * @author Criss Candioti
 */
public class ColeccionesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
}
