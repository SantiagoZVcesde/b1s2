package com.example;
public class estadio {
    String nombre;
    String ciudad; 
    int capacidad;

    public void mostrarinformacion(){
        System.out.println("Nombre del estadio: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Capacidad: " + capacidad);
    }


    public static void main(String[] args) {

        estadio Estadiometropolitano = new estadio();
        estadio Estadioelcampin = new estadio();

        Estadiometropolitano.nombre = "Estadio Metropolitano";
        Estadiometropolitano.ciudad = "Barranquilla";
        Estadiometropolitano.capacidad = 46000;

        Estadioelcampin.nombre = "Estadio El Campín";
        Estadioelcampin.ciudad = "Bogotá";  
        Estadioelcampin.capacidad = 36000;

        Estadiometropolitano.mostrarinformacion();
        Estadioelcampin.mostrarinformacion();

        
    }

}
