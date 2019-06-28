/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

/**
 *
 * @author Usuario
 */
public class Silla {

    String columna;
    int fila;
    boolean reservada;
    Reserva reserva;

    public Silla(String _columna, int _fila) {
        columna = _columna;
        fila = _fila;
        reservada = false;
    }

    public void reservar() {
        reserva = new Reserva();
        reservada = true;
    }

    public void eliminarReserva(){
        reserva = null;
    }

    //gets
    public String getColumna(){
        return columna; 
    }

    public int getFila(){
        return fila;
    }

    public boolean getReservada(){
        return reservada;
    }

    public Reserva getReserva(){
        return reserva;
    }
}
