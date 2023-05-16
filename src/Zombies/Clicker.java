package Zombies;

import Modulos.Zombie;

public class Clicker extends Zombie {

    public Clicker(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y, nombre, skin, vida, armas);
    }

    @Override
    public String toString() {
        return "Clicker{} " + super.toString();
    }

    @Override
    public String morder() {
        return "mordida Clicker";
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+ "CLICKER:";
    }
}
