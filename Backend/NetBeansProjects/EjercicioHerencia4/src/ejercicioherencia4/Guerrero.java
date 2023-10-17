package ejercicioherencia4;

/**
 *
 * @author Criss Candioti
 */
public class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero(Position ubicacion, String nick) {
        super(ubicacion, nick);
    }

    public boolean isCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }

    //Disparar que consume 10 unidades de energía y podrá disparar hasta que consuma toda su energía.
    //Sobreescribir el comportamiento de Disparar para que si tiene menos de 30 unidades de energía
    //pierda el caballo.
    @Override
    public void disparar() {
        if (this.isCaballo() == true) {
            super.disparar();

            if (super.energia <= 30) {
                this.setCaballo(false);
                System.out.println("La energia disminuyo a 30 perderemos nuestro caballo");
                System.out.println("Proseguiremos a pie");

            }

        } else {

            super.disparar();

        }
    }

    //Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente N,E,S,O.....
    @Override
    public void girar() {
        super.girar();
    }

//    Avanzar que si el personaje está mirando hacia el norte: crece en 1 el valor Y de su posición; si
//está mirando al Sur: decrece en 1 el valor de Y, si mira al Este: crece en 1 el valor de X, y si mira
//al Oeste: decrece en 1 el valor de X.
//    Sobreescribir el comportamiento de Avanzar para que si tiene un caballo avanzará de a 10 pasos
//caso contrario se comportará como el método de la clase padre.
    @Override
    public void avanzar() {
        if (this.isCaballo() == true) {
            System.out.println("Tenemos un caballo a disposicion, avanzaremos mas rapido, ahora nuestros pasos aumentan a 10");
            System.out.println("Nuestro guerrero esta ubicado " + this.ubicacion);
            if (this.orientacion == 'n') {
                System.out.println("El guerrero está mirando hacia el norte crece en 1 el valor Y de su posición");
                this.ubicacion.setY(this.ubicacion.getY() + 10);

            } else if (this.orientacion == 'e') {
                System.out.println("El guerrero esta mirando hacia el este crece en 1 el valor de X de su posicion");
                this.ubicacion.setX(this.ubicacion.getX() + 10);

            } else if (this.orientacion == 's') {
                System.out.println("El guerrero está mirando hacia el sur decrece en 1 el valor Y de su posición");
                this.ubicacion.setY(this.ubicacion.getY() - 10);

            } else if (this.orientacion == 'o') {
                System.out.println("El guerrero está mirando hacia el oeste decrece en 1 el valor X de su posición");
                this.ubicacion.setX(this.ubicacion.getX() - 10);
            }

        } else {
            System.out.println("No tenemos ningun caballo a nuestra disposicion, haremos el camino a pie");
            super.avanzar();
        }
    }

}
