package Modulos;

public abstract class Personaje extends Entidad implements IAccionesPersonaje{
    private String nombre;
    private int skin; //al estar en una base de datos la skin completa la llamamos con un entero, cada skin tiene su entero unico
    private int vida; //la vida siempre es un entero, esta o no esta xD (maximo valor=dependiente de clase y tipo de zombie)
    private String armas;

    public Personaje(double x, double y, String nombre, int skin, int vida, String armas) {
        super(x, y);
        this.nombre = nombre;
        this.skin = skin;
        this.vida = vida;
        this.armas = armas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSkin() {
        return skin;
    }

    public int getVida() {
        return vida;
    }

    public String getArmas() {
        return armas;
    }


    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", skin=" + skin +
                ", vida=" + vida +
                ", armas='" + armas + '\'' +
                "} " + super.toString();
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+"/-/vida: "+getVida()+" nombre: "+getNombre()+" arma: "+getArmas()+" skin: "+getSkin();
    }
}
