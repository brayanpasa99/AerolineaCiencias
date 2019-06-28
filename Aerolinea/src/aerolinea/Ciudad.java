/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

/**
 *
 * @author braya
 */
public class Ciudad {

    String nombre;
    double coordenadaX, coordenadaY;

    public Ciudad(String nombre, double coordenadaX, double coordenadaY) {

        asignarNombre(nombre);
        asignarCoordenadas(coordenadaX, coordenadaY);

    }

    public void asignarNombre(String nombre) {

        this.nombre = nombre;

    }

    public void asignarCoordenadas(double coordenadaX, double coordenadaY) {

        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;

    }

    public String obtenerNombre() {

        return nombre;
    }

}
