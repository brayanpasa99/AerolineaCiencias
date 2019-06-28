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

    String avion;
    char[] columna = {'A', 'B', 'C', 'D', 'E'};
    int filas, capacidad, sillasDisponibles;
    Ciudad ciudadOrigen, ciudadDestino;
    Date fechayHora;
    Vuelo vueloSiguiente, vueloAnterior;
    Silla[][] sillas;
    int op = 0;

    //Constructor vuelo que recibe la ciudad de origen y la de destino
    public Vuelo(Ciudad ciudadOrigen, Ciudad ciudadDestino) {

        agregarOrigen(ciudadOrigen);
        agregarDestino(ciudadDestino);
        
        /*columna[0] = 'A';
        columna[1] = 'B';
        columna[2] = 'C';
        columna[3] = 'D';
        columna[4] = 'E';*/
        
        sillas = new Silla[5][14];
        
        for(int i=0; i<5; i++){
            for(int j=0; j<14; j++){
                sillas[i][j] = new Silla("A", 5);
            }
        }
        
        System.out.println("I'M HERE"+sillas[1][1]);

    }

    //Asignaciones y eliminaciones para cada variable respectivamente
    /*public void asignarCodigo(int cod) {
        this.codigo = cod;
    }

    public void eliminarCodigo() {
        this.codigo = 0;
    }*/

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
                    int entradaColumna = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la fila ");
                    int entradaFila = sc.nextInt();
                    sc.nextLine();
                    sillas[entradaColumna][entradaFila].reservar();
                    break;
                    
                case 2:
                    System.out.println("ingrese la columna");
                    entradaColumna = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ingrese la fila ");
                    entradaFila = sc.nextInt();
                    sc.nextLine();
                    sillas[entradaColumna][entradaFila].eliminarReserva();
                    break;
                default:
                    break;
            }


        }
    }

    //Get's para cada variable respectivamente
    /*public int getCodigo() {
        return codigo;
    }*/

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

}
