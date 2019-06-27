/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import java.util.Date;

/**
 *
 * @author braya
 */
public class Vuelo {
    String codigo, avion;
    char columna[];
    int filas, capacidad, sillasDisponibles;
    Ciudad ciudadOrigen, ciudadDestino;
    Date fechayHora;
    Vuelo vueloSiguiente, vueloAnterior;
    
    //Asignaciones y eliminaciones para cada variable respectivamente
    public void asignarCodigo(String cod){
        this.codigo = cod;
    }
    
    public void eliminarCodigo(){
        this.codigo = null;
    }
    
    public void asignarFechaYHora(Date fecha){
        this.fechayHora = fecha;
    }
    
    public void eliminarFechaYHora(){
        this.fechayHora = null;
    }
    
    public void asignarAvion(String av){
        this.avion = av;
    }
    
    public void eliminarAvion(){
        this.avion = null;
    }
    
    public void agregarAnterior(Vuelo anterior){
        this.vueloAnterior = anterior;
    }
    
    public void eliminarAnterior(){
        this.vueloAnterior = null;
    }

    public void agregarSiguiente(Vuelo siguiente){
        this.vueloSiguiente = siguiente;
    }
    
    public void eliminarSiguiente(){
        this.vueloSiguiente = null;
    }
    
    public void agregarOrigen(Ciudad origen){
        this.ciudadOrigen = origen;
    }
    
    public void eliminarOrigen(){
        this.ciudadOrigen = null;
    }
    
    public void agregarDestino(Ciudad destino){
        this.ciudadDestino = destino;
    }
    
    public void eliminarDestino(){
        this.ciudadDestino = null;
    }
    
    //Get's para cada variable respectivamente
    public String getCodigo() {
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
    public Vuelo(){ 
        columna[0]='A';
        columna[1]='B';
        columna[2]='C';
        columna[3]='D';
        columna[4]='E';
    }
}
