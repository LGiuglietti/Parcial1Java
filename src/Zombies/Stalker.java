package Zombies;

import Modulos.Zombie;

public class Stalker extends Zombie {
    public Stalker(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y, nombre, skin, vida, armas);
    }

    @Override
    public String toString() {
        return "Stalker{} " + super.toString();
    }

    @Override
    public String morder() {
        return "mordida Stalker";
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+ "STALKER:";
    }
}
