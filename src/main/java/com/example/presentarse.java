package com.example;

public class presentarse {

    String nombre;
    String posicion;
    int numero;
    String pieDebil;
    double altura;

    public void presentarseJugadores() {
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Posición en que juega es: " + posicion);
        System.out.println("Número: " + numero);
        System.out.println("PieDebil de jugador:" + pieDebil);
        System.out.println("La altura de el jugador es:" + altura);

    }

    public static void main(String[] args) {

        presentarse jugadorUno = new presentarse();

        jugadorUno.nombre = "Samuel";
        jugadorUno.posicion = "MCD";
        jugadorUno.numero = 4;
        jugadorUno.pieDebil = "Derecho";
        jugadorUno.altura = 1.65;

        jugadorUno.presentarseJugadores();

        System.out.println("--------------------------------------");

        presentarse jugadorDos = new presentarse();

        jugadorDos.nombre = "Santiago";
        jugadorDos.posicion = "MC";
        jugadorDos.numero = 6;
        jugadorDos.pieDebil = "Izquierdo";
        jugadorDos.altura = 1.72;

        jugadorDos.presentarseJugadores();

        System.out.println("--------------------------------------");

        presentarse jugadorTres = new presentarse();

        jugadorTres.nombre = "Cristiano ronaldo";
        jugadorTres.posicion = "DC";
        jugadorTres.numero = 7;
        jugadorTres.pieDebil = "Izquierdo";
        jugadorTres.altura = 1.87;

        jugadorTres.presentarseJugadores();
    }
}
