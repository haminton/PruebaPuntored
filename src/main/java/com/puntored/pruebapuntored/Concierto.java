package com.puntored.pruebapuntored;

public class Concierto {
    
    private int entradasDisponibles = 100;

    public Concierto() {
    }
    
    
    public synchronized void venderEntrada() {
        entradasDisponibles--;
        if(entradasDisponibles <= 0) {
            return;
        }
        System.out.println("Se ha vendido una entrada, Entradas disponibles " + entradasDisponibles);
    }
    
}
