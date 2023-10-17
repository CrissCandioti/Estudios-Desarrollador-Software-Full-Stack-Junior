/*

 */
package ejercicioherencia4;

/**
 *
 * @author Criss Candioti
 */
public abstract class Personaje {

    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion = 'n';

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }

    //Disparar que consume 10 unidades de energía y podrá disparar hasta que consuma toda su energía.
    public void disparar() {
        if (this.energia > 0) {
            this.energia -= 10;
            System.out.println("Energia del guerrero: " + this.energia);
        } else {
            System.out.println("El guerrero no tiene mas energia para disparar");
        }
    }

    //Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente N,E,S,O…..
    public void girar() {
        if (this.orientacion == 'n') {
            System.out.println("El guerrero esta mirando al norte, ahora cambiaremos de orientacion");
            this.orientacion = 'e';

        } else if (this.orientacion == 'e') {
            System.out.println("El guerrero esta mirando al este, ahora cambiaremos de orientacion");
            this.orientacion = 's';

        } else if (this.orientacion == 's') {
            System.out.println("El guerrero esta mirando al sur, ahora cambiaremos de orientacion");
            this.orientacion = 'o';

        } else if (this.orientacion == 'o') {
            System.out.println("El guerrero esta mirando al oeste, ahora cambiaremos de orientacion al norte nuevamente");
            this.orientacion = 'n';

        }
    }

    //Avanzar que si el personaje está mirando hacia el norte: crece en 1 el valor Y de su posición; si está mirando al Sur: decrece en 1 el valor de Y, si mira al Este: crece en 1 el valor de X, y si mira al Oeste: decrece en 1 el valor de X.
    public void avanzar() {
        System.out.println("Nuestro guerrero esta ubicado " + this.ubicacion);
        if (this.orientacion == 'n') {
            System.out.println("El guerrero está mirando hacia el norte crece en 1 el valor Y de su posición");
            this.ubicacion.setY(this.ubicacion.getY() + 1);

        } else if (this.orientacion == 'e') {
            System.out.println("El guerrero esta mirando hacia el este crece en 1 el valor de X de su posicion");
            this.ubicacion.setX(this.ubicacion.getX() + 1);

        } else if (this.orientacion == 's') {
            System.out.println("El guerrero está mirando hacia el sur decrece en 1 el valor Y de su posición");
            this.ubicacion.setY(this.ubicacion.getY() - 1);

        } else if (this.orientacion == 'o') {
            System.out.println("El guerrero está mirando hacia el oeste decrece en 1 el valor X de su posición");
            this.ubicacion.setX(this.ubicacion.getX() - 1);
        }
    }

}
