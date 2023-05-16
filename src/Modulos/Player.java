package Modulos;

public class Player extends Personaje{

    public Player(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y, nombre, skin, vida, armas);
    }

    @Override
    public String atacar() {
        return "Estoy atacando con mi "+getArmas();
    }

    @Override
    public String defenderse() {
        return "estoy defendiendome";
    }

    @Override
    public String morir() {
        return "GAME OVER";
    }
    @Override
    public String cargarEnergia() {
        return "WTF porque puedo cargar energia siendo una persona O.o";
    }
    public String curarse()
    {
        return "me cure";
    }

    @Override
    public String toString() {
        return " " + super.toString();
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+"";
    }
}
