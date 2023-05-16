package Modulos;

public class Objeto extends Entidad{
    private double ancho;//en metros
    private double alto;//en metros

    public Objeto(double x, double y, double ancho, double alto) {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    //voy a necesitar setters para distintos tipos de objetos

    @Override
    public String toString() {
        return "Objeto{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} " + super.toString();
    }

    @Override
    public String mostrarObjeto(int i) {
        return super.mostrarObjeto(i)+"/ancho: "+getAncho()+" alto: "+getAlto();
    }
}
