/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerolinea;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JFrame;

/**
 *
 * @author braya
 */
public class Aerolinea extends JFrame {

    Integer num_vuelos;
    int op = -1;
    String nombreCiudad, ciudadOrigen, ciudadDestino;
    int eliminaIdCiudad, eliminaIdVuelo, reservaVuelo, consultaVuelo;
    Scanner sc;
    LocalDateTime fecha;
    /*Ciudades de las que dispone la aerolínea*/
    ArrayList<Ciudad> ciudades;

    /*Vuelos que tiene la aerolínea*/
    Hashtable<Integer, Vuelo> Vuelos;

    public Aerolinea() {

        num_vuelos = 0;
        Vuelos = new Hashtable<>();
        ciudades = new ArrayList<>();
        sc = new Scanner(System.in);
        fecha = LocalDateTime.now();
        
        op=-1;

        while (op != 9) {

            System.out.println("1. Agregar Ciudad");
            System.out.println("2. Consultar Ciudades");
            System.out.println("3. Eliminar Ciudad");
            System.out.println("4. Agregar Vuelo");
            System.out.println("5. Consultar Vuelos");
            System.out.println("6. Reservar una silla");
            System.out.println("7. Eliminar Vuelo");
            System.out.println("8. Consultar Reserva");
            System.out.println("9. Salir\n");

            System.out.println("Ingrese la opción: \n");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.println("\nIngrese la ciudad que desea agregar: \n");
                    nombreCiudad = sc.nextLine();
                    agregarCiudad(nombreCiudad);
                    System.out.println("\nCiudad agregada correctamente\n");
                    break;

                case 2:
                    consultarCiudades();
                    break;

                case 3:
                    System.out.println("\nIngrese el número de la ciudad que desea eliminar: \n");
                    eliminaIdCiudad = sc.nextInt();
                    sc.nextLine();
                    eliminarCiudad(eliminaIdCiudad - 1);
                    System.out.println("\nCiudad eliminada correctamente\n");
                    break;

                case 4:
                    System.out.println("\nIngrese la ciudad de origen del vuelo\n");
                    ciudadOrigen = sc.nextLine();
                    System.out.println("\nIngrese la ciudad de destino del vuelo\n");
                    ciudadDestino = sc.nextLine();
                    agregarVuelo(ciudadOrigen, ciudadDestino);
                    System.out.println("\nVuelo agregado correctamente\n");
                    break;

                case 5:
                    consultarVuelos();
                    break;
                case 6:
                    System.out.println("\nIngrese id del vuelo al que desea reservar\n");
                    reservaVuelo = sc.nextInt();
                    sc.nextLine();
                    Vuelos.get(reservaVuelo - 1).hacerReserva();
                    break;

                case 7:
                    System.out.println("\nIngrese el número del vuelo que desea eliminar: \n");
                    eliminaIdVuelo = sc.nextInt();
                    sc.nextLine();
                    eliminarVuelo(eliminaIdVuelo - 1);
                    System.out.println("\nVuelo eliminado correctamente\n");
                    break;

                case 8:
                    System.out.println("\nIngrese id del vuelo al que desea consultar\n");
                    consultaVuelo = sc.nextInt();
                    sc.nextLine();
                    Silla[][] matriz = Vuelos.get(consultaVuelo - 1).getSillas();

                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 14; j++) {
                            System.out.print(matriz[i][j].getReservada()+" ");
                        }
                        System.out.println("");
                    }
                    break;
                    
                default:
                    break;

            }

        }

    }

    public void agregarVuelo(String ciudadOrigen, String ciudadDestino) {

        int c1 = -1, c2 = -1;

        for (int i = 0; i < ciudades.size(); i++) {
            if (ciudades.get(i).obtenerNombre().equals(ciudadOrigen) && ciudades.get(i).obtenerNombre().equals(ciudadDestino)) {
                System.out.println("La ciudad de origen y destino es la misma");
            } else if (ciudades.get(i).obtenerNombre().equals(ciudadOrigen) || ciudades.get(i).obtenerNombre().equals(ciudadDestino)) {
                if (ciudades.get(i).obtenerNombre().equals(ciudadOrigen)) {
                    c1 = i;
                } else if (ciudades.get(i).obtenerNombre().equals(ciudadDestino)) {
                    c2 = i;
                }
            }
        }

        if (c1 != -1 && c2 != -1) {

            fecha = LocalDateTime.now();
            Vuelos.put(num_vuelos, new Vuelo(ciudades.get(c1), ciudades.get(c2), fecha));
            num_vuelos = num_vuelos + 1;

        } else {

            System.out.println("NO DEBERÍA ENTRAR");

        }

    }

    public void eliminarVuelo(int idVuelo) {

        Vuelos.remove(idVuelo);

    }

    public void agregarCiudad(String nombreCiudad) {

        ciudades.add(new Ciudad(nombreCiudad, 1.6, 1.6));

    }

    public void eliminarCiudad(int idCiudad) {

        ciudades.remove(idCiudad);

    }

    public void consultarCiudades() {
        System.out.println("");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println(i + 1 + " " + ciudades.get(i).obtenerNombre());
        }
        System.out.println("");
    }

    public void consultarVuelos() {
        Object[] llaves = Vuelos.keySet().toArray();
        for (int i = 0; i < Vuelos.size(); i++) {
            System.out.println(llaves[i] + ". Desde: " + Vuelos.get(llaves[i]).getCiudadOrigen().obtenerNombre() + " Hasta: " + Vuelos.get(llaves[i]).getCiudadDestino().obtenerNombre() + " Fecha: " + Vuelos.get(llaves[i]).getFechayHora());
        }
        System.out.println("");
    }

}
