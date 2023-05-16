package Players;

import Modulos.Player;

public class Ellie extends Player {
    private int cantidadChistesMalos;//un monton
    private int gradoHumor;

    public Ellie(double x, double y, String nombre, int skin, int vida, String armas, int cantidadChistesMalos, int gradoHumor) {
        super(x, y, nombre, skin, vida, armas);
        this.cantidadChistesMalos = cantidadChistesMalos;
        this.gradoHumor = gradoHumor;
    }

    public int getCantidadChistesMalos() {
        return cantidadChistesMalos;
    }

    public void setCantidadChistesMalos(int cantidadChistesMalos) { //siempre se puede aprender mas
        this.cantidadChistesMalos = cantidadChistesMalos;
    }
    //siempre puede aprender mas chistes malos
    public int getGradoHumor() {
        return gradoHumor;
    }

    public void setGradoHumor(int gradoHumor) { //como varia hay set
        this.gradoHumor = gradoHumor;
    } //su grado de humor puede variar

    @Override
    public String toString() {
        return "Ellie{" +
                "cantidadChistesMalos=" + cantidadChistesMalos +
                ", gradoHumor=" + gradoHumor +
                "} " + super.toString();
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+"/-/cantidad chistes malos: "+getCantidadChistesMalos()+" grado de humor: "+getGradoHumor();
    }
}
