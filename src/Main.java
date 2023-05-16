import Modulos.Entidad;
import Modulos.Juego;
import Modulos.Objeto;
import Modulos.Personaje;
import Objetos.Muro;
import Objetos.Plataforma;
import Players.Ellie;
import Players.Joel;
import Zombies.Bloater;
import Zombies.Clicker;
import Zombies.Runner;
import Zombies.Stalker;

import javax.management.relation.RelationNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creo a los personajes principales
        Personaje Joel = new Joel(0,0,"joel",2,10,"machete","testarudo",100);
        Personaje Ellie =new Ellie(2,0,"ellie",1,8,"arco y glecha",24,67);
        //creo la entidad juego con constructor por defecto
        Juego game=new Juego();
        //agrego al arreglo a joel(pos 0) y a ellie (pos 1)
        game.agregarPersonaje(Joel);
        game.agregarPersonaje(Ellie);
        //agregamos uno de cada zombie
        Personaje zombie=new Bloater(15,80,"bloater",0,25,"dientes"); //pos 2 bloater
        game.agregarPersonaje(zombie);
        zombie=new Runner(56,32,"Runner",0,20,"dientes");
        game.agregarPersonaje(zombie);
        zombie=new Clicker(16,0,"Clicker",0,31,"dientes");
        game.agregarPersonaje(zombie);
        zombie=new Stalker(46,15,"Stalker",0,10,"dientes");
        game.agregarPersonaje(zombie);

        //agregamos un par de objetos
        Objeto objeto=new Muro(4,20,4.5,6.8,3);
        game.agregarObjeto(objeto);
        objeto= new Plataforma(800,5,1.2,5.6,"acero",1);
        game.agregarObjeto(objeto);

        System.out.println(game.mostrarListaObjetos());
        System.out.println(game.mostrarListaPersonajes());

        System.out.println(game.toString());
        System.out.println("/-----------------------------------------------");
        System.out.println("Players:");
        System.out.println("/-----------------------------------------------");
        //prueba de funciones personajes principales
        System.out.println(game.getListaDePersonajes().get(0).cargarEnergia());
        System.out.println(game.getListaDePersonajes().get(0).atacar());
        System.out.println(game.getListaDePersonajes().get(0).defenderse());
        System.out.println(game.getListaDePersonajes().get(0).morir());
        System.out.println("/-----------------------------------------------");
        System.out.println("Zombies:");
        System.out.println("/-----------------------------------------------");
        //prueba zombies
        System.out.println(game.getListaDePersonajes().get(4).cargarEnergia());
        System.out.println(game.getListaDePersonajes().get(4).atacar());
        System.out.println(game.getListaDePersonajes().get(4).defenderse());
        System.out.println(game.getListaDePersonajes().get(4).morir());
        //prueba camuflaje
        System.out.println("/-----------------------------------------------");
        System.out.println("zombies: prueba bloater");
        System.out.println("/-----------------------------------------------");
        if(game.getListaDePersonajes().get(2) instanceof Bloater)
        {
            Bloater zombieBloater= (Bloater) game.getListaDePersonajes().get(2);
            System.out.println(zombieBloater.camuflarse());
        }


    }
}