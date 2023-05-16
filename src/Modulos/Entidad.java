package Modulos;

import java.util.ArrayList;

public abstract class Entidad {
    private double x; //posicion x
    private double y; //posicion y


    public Entidad(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Entidad()
    {
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Entidad{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public String mostrarObjeto(int i) {
        return "X: "+getX()+" Y: "+getY();
    }
    public String mostrarPersona(int i) {return "X: "+getX()+" Y: "+getY();}

}
