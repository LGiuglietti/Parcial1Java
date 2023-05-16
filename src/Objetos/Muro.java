package Objetos;

import Modulos.Objeto;

public class Muro extends Objeto {
    private int resistencia;

    public Muro(double x, double y, double ancho, double alto, int resistencia) {
        super(x, y, ancho, alto);
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) { //si el muro recibe danio va a cambiar su resistencia
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Muro{" +
                "resistencia=" + resistencia +
                "} " + super.toString();
    }

    @Override
    public String mostrarObjeto(int i) {
        return super.mostrarObjeto(i)+"/ resistencia: "+getResistencia();
    }
}
