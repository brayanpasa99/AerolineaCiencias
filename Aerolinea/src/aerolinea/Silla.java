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

    char columna;
    int fila;
    boolean reservada;
    Reserva reserva;

    public Silla(String _columna, int _fila) {
        reservada = false;
    }

    public void reservar() {
        reserva = new Reserva();
    }

    public void eliminarReserva(){
        reserva = null;
    }

    //gets
    public char getColumna(){
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
