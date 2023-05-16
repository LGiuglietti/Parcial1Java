package Objetos;

import Modulos.Objeto;

public class Plataforma extends Objeto {
    private String material;
    private int soporte;//a nivel de programacion solo nos interesa la integridad
                        // del soporte: 1-si tiene soporte, 0-se rompio el soporte

    public Plataforma(double x, double y, double ancho, double alto, String material, int soporte) {
        super(x, y, ancho, alto);
        this.material = material;
        this.soporte = soporte;
    }

    public String getMaterial() {
        return material;
    }

    public int getSoporte() {
        return soporte;
    }

    public void setSoporte(int soporte) { //para modificarlo si recibe danio
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "material='" + material + '\'' +
                ", soporte=" + soporte +
                "} " + super.toString();
    }

    @Override
    public String mostrarObjeto(int i) {
        return super.mostrarObjeto(i)+"/ material: "+getMaterial()+" /soporte: "+getSoporte();
    }
}
