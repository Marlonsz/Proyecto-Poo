/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehículos;

import java.util.Date;

/**
 *
 * @author Marlon
 */
public class Otro extends Vehiculo {
    /*Poner 3 atributos unicos de otros tipos de vehiculos*/

    public Otro(String marca, String modelo, Date fechafab, String numchasis,
                String nummotor, String propietario,
                double cilindraje, double precsug, Date fing,
                Date fvent) {
        super(marca, modelo, fechafab, numchasis, nummotor, propietario,
                cilindraje, precsug, fing, fvent);
    }
    
}
