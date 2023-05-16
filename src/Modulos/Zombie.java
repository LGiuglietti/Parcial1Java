package Modulos;

public class Zombie extends Personaje {
    public Zombie(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y, nombre, skin, vida, armas);
    }

    @Override
    public String atacar() {
        return morder()+" carne rica";
    }

    @Override
    public String defenderse() {
        return "no mates zombiee!!";
    }

    @Override
    public String morir() {
        return "enemigo abatido";
    }

    @Override
    public String cargarEnergia() {
        return "RAHHHH!!!(zombie cargando energia?)";
    }
    public String morder(){ //sobrecarga cada zombie muerde diferente
        return "morder morder morder morder";//dejo retorno generico para zombies genericos a agregar a futuro
    }

    @Override
    public String toString() {
        return "Zombie{" + super.toString();
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+"/ ZOMBIE:";
    }
}
