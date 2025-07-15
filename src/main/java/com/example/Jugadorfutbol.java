package com.example;

import java.util.Scanner;

public class Jugadorfutbol {

    String posicion;
    String nombre;

    public void mostrarInformacion() {
        System.out.println("Nombre del jugador: " + nombre);
        System.out.println("Posición en que juega es: " + posicion);
    }

    public void cambiarPosicion() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nueva posición del jugador en la siguiente linea: ");
        String nuevaPosicion = scanner.nextLine();

        System.out.println(nombre + " ahora juega en la posición de: " + nuevaPosicion);

        scanner.close();
    }

    public static void main(String[] args) {
        Jugadorfutbol santiago = new Jugadorfutbol();

        santiago.nombre = "Santiago";
        santiago.posicion = "MCD";

        santiago.mostrarInformacion();
        System.out.println("-------------------------------------------");
        santiago.cambiarPosicion();

    }
}