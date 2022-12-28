package com.puntored.pruebapuntored;

public class PruebaPuntored {

    public static void main(String[] args) {
        Concierto concierto = new Concierto();
        PuntoVenta puntoDeVentaUno = new PuntoVenta();
        PuntoVenta puntoDeVentaDos = new PuntoVenta();
        
        puntoDeVentaUno.valorPuntoVenta(concierto, 100);
        puntoDeVentaDos.valorPuntoVenta(concierto, 50);
        
        puntoDeVentaUno.start();
        puntoDeVentaDos.start();

    }
}
