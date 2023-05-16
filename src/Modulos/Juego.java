package Modulos;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Personaje> listaDePersonajes;
    private ArrayList<Objeto> listaDeObjetos;

    public Juego() {
        this.listaDePersonajes = new ArrayList<>();
        this.listaDeObjetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto o)
    {
        listaDeObjetos.add(o);
    }
    public void borrarObjeto(Objeto o)
    {
        listaDeObjetos.remove(o);
    }
    public String mostrarListaObjetos()
    {
        String aux=new String();
        for (int i=0;i<listaDeObjetos.size();i++)
        {
            aux+=listaDeObjetos.get(i).mostrarObjeto(i)+"\n";
        }
        return aux;
    }
    public String mostrarListaPersonajes()
    {
        String aux=new String();
        for (int i=0;i< listaDePersonajes.size();i++)
        {
           aux+=listaDePersonajes.get(i).mostrarPersona(i)+"\n";
        }
        return aux;
    }
    public void agregarPersonaje(Personaje p)
    { //ambos protas los ingreso en el main con funcion set
        if(p.getNombre().equalsIgnoreCase("joel"))
        {
            if(listaDePersonajes.contains(p))
            {
                //solo puede haber un joel
            }
            else
            {
                listaDePersonajes.add(p);
            }
            //solo puede haber un joel
        } else if (p.getNombre().equalsIgnoreCase("ellie")) {
            if(listaDePersonajes.contains(p))
            {
                //solo puede haber una ellie
            }
            else
            {
                listaDePersonajes.add(p);
            }
        } else {
            listaDePersonajes.add(p);
        }
    }
    //la misma logica, el unico enemigo removible en si son los zombies
    // si joel o ellie mueren GAME OVER
    public void borrarPersonaje(Personaje p)
    {
        if(p.getNombre().equalsIgnoreCase("joel")){
            //solo puede haber un joel
        } else if (p.getNombre().equalsIgnoreCase("ellie")) {
            //solo puede haber una Ellie
        } else {
            listaDePersonajes.remove(p);
        }
    }
    public ArrayList<Personaje> getListaDePersonajes() {
        return listaDePersonajes;
    }

    public void setListaDePersonajes(ArrayList<Personaje> listaDePersonajes) {
        this.listaDePersonajes = listaDePersonajes;
    }
}
