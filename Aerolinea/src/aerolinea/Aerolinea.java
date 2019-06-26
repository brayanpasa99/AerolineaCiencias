/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author braya
 */
public class Aerolinea {
    
    Integer num_vuelos;
    
    /*Ciudades de las que dispone la aerolínea*/
    
    ArrayList<Ciudad> ciudades = new ArrayList<>();
    
    /*Vuelos que tiene la aerolínea*/
    
    Hashtable<Integer, Vuelo> idVuelos = new Hashtable<>();
    
    public Aerolinea(){
        
        num_vuelos = 0;
        
    }
    
    public void crearVuelo(){
        
        idVuelos.put(num_vuelos, new Vuelo());
        num_vuelos = num_vuelos++;
        
    }
    
    public void crearCiudad(String nombreCiudad){
        
        ciudades.add(new Ciudad(nombreCiudad));
        
    }
    
    
    
    
}
