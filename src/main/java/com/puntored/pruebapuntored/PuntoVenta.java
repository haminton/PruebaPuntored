
package com.puntored.pruebapuntored;

public class PuntoVenta extends Thread{
    
    private Concierto concierto;
    private int numEntradas;
    
    
    @Override
    public void run() {
        for (int i = 0; i < numEntradas; i++) {
            concierto.venderEntrada();
        }
    }
    
    public void valorPuntoVenta(Concierto nombre, int valor) {
        this.concierto = nombre;
        this.numEntradas = valor;
    }
    
}
