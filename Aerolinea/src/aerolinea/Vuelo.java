/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Vuelo {

    int codigo; 
    String avion;
    char columna[];
    int filas, capacidad, sillasDisponibles;
    Ciudad ciudadOrigen, ciudadDestino;
    Date fechayHora;
    Vuelo vueloSiguiente, vueloAnterior;
    Silla[][] sillas;
    int op = 0;

    //Constructor vuelo que recibe la ciudad de origen y la de destino
    public Vuelo(Ciudad ciudadOrigen, Ciudad ciudadDestino, int cod) {

        agregarOrigen(ciudadOrigen);
        agregarDestino(ciudadDestino);
        codigo = cod;

    }

    //Asignaciones y eliminaciones para cada variable respectivamente
    public void asignarCodigo(int cod) {
        this.codigo = cod;
    }

    public void eliminarCodigo() {
        this.codigo = 0;
    }

    public void asignarFechaYHora(Date fecha) {
        this.fechayHora = fecha;
    }

    public void eliminarFechaYHora() {
        this.fechayHora = null;
    }

    public void asignarAvion(String av) {
        this.avion = av;
    }

    public void eliminarAvion() {
        this.avion = null;
    }

    public void agregarAnterior(Vuelo anterior) {
        this.vueloAnterior = anterior;
    }

    public void eliminarAnterior() {
        this.vueloAnterior = null;
    }

    public void agregarSiguiente(Vuelo siguiente) {
        this.vueloSiguiente = siguiente;
    }

    public void eliminarSiguiente() {
        this.vueloSiguiente = null;
    }

    public void agregarOrigen(Ciudad origen) {
        this.ciudadOrigen = origen;
    }

    public void eliminarOrigen() {
        this.ciudadOrigen = null;
    }

    public void agregarDestino(Ciudad destino) {
        this.ciudadDestino = destino;
    }

    public void eliminarDestino() {
        this.ciudadDestino = null;
    }

    //menu para la reserva en un vuelo
    public void hacerReserva(){
        
        Scanner sc = new Scanner(System.in);
        while (op != 3){
            System.out.println("1. Crear Reserva");
            System.out.println("2. Eliminar Reserva");
            System.out.println("3. Salir\n");

            System.out.println("Ingrese la opción: \n");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("ingrese la columna");
                    int entradaColuna = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la fila ");
                    int entradaFila = sc.nextInt();
                    sc.nextLine();
                    sillas[entradaColuna][entradaFila].reservar();
                    break;
                case 2:
                    System.out.println("ingrese la columna");
                    entradaColuna = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la fila ");
                    entradaFila = sc.nextInt();
                    sc.nextLine();
                    sillas[entradaColuna][entradaFila].eliminarReserva();
                    break;
                default:
                    break;
            }


        }
    }

    //Get's para cada variable respectivamente
    public int getCodigo() {
        return codigo;
    }

    public String getAvion() {
        return avion;
    }

    public char[] getColumna() {
        return columna;
    }

    public int getFilas() {
        return filas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getSillasDisponibles() {
        return sillasDisponibles;
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public Date getFechayHora() {
        return fechayHora;
    }

    public Vuelo getVueloSiguiente() {
        return vueloSiguiente;
    }

    public Vuelo getVueloAnterior() {
        return vueloAnterior;
    }

    //Constructor(Datos predet)
    public Vuelo() {
        columna[0] = 'A';
        columna[1] = 'B';
        columna[2] = 'C';
        columna[3] = 'D';
        columna[4] = 'E';
        
        sillas = new Silla[5][14];
    }
}
