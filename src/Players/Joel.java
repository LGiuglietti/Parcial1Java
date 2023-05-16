package Players;

import Modulos.Player;

public class Joel extends Player {
    private String actitud; //testarudo por defecto, puede variar si sacrifica al mundo por Ellie
    private int malaOnda; //del 1-100 que tan mala onda esta en el momento

    public Joel(double x, double y, String nombre, int skin, int vida, String armas, String actitud, int malaOnda) {
        super(x, y, nombre, skin, vida, armas);
        this.actitud = actitud;
        this.malaOnda = malaOnda;
    }

    public String getActitud() {
        return actitud;
    }

    public void setActitud(String actitud) {
        this.actitud = actitud;
    }
    //varia dependiendo del contexto
    public int getMalaOnda() {
        return malaOnda;
    }

    public void setMalaOnda(int malaOnda) {
        this.malaOnda = malaOnda;
    }
    //hay veces que no es tan mala onda

    @Override
    public String toString() {
        return "Joel{" +
                "actitud='" + actitud + '\'' +
                ", malaOnda=" + malaOnda +
                "} " + super.toString();
    }

    @Override
    public String mostrarPersona(int i) {
        return super.mostrarPersona(i)+"/-/ actitud: "+getActitud()+"mala onda: "+getMalaOnda();
    }
}
