package Zombies;

import Modulos.ICamuflaje;
import Modulos.Zombie;

public class Bloater extends Zombie implements ICamuflaje {

    public Bloater(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y, nombre, skin, vida, armas);
    }

    @Override
    public String camuflarse() {
        return "el bloater se camufla evitando que la luz llege a su cuerpo siendo entonces invisible";
    }

    @Override
    public String toString() {
        return "Bloater{ " + super.toString();
    }

    @Override
    public String morder() {
        return "mordida Bloater";
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+ "BLOATER:";
    }
}
