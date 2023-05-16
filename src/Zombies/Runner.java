package Zombies;

import Modulos.Zombie;

public class Runner extends Zombie {
    public Runner(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y, nombre, skin, vida, armas);
    }

    @Override
    public String toString() {
        return "Runner{} " + super.toString();
    }

    @Override
    public String morder() {
        return "mordida Runner";
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+ "RUNNER:";
    }
}
