/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Reserva {
    Scanner scn = new Scanner(System.in);
    String nombre;
    int cedula;

    Reserva() {
        this.crearReserva();
    }

    public void crearReserva(){
        this.asignarNombre();
        this.asignarCedula();
    }
    

    public void asignarNombre() {
        System.out.println("Ingrese el nombre");
        String _nombre = scn.nextLine();
        this.nombre = _nombre;
    }

    public void asignarCedula() {
        System.out.println("Inbrese la cedula");
        String _cedula = scn.nextLine();
        this.cedula = Integer.parseInt(_cedula);
    }

    //gets
    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

}
