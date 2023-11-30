/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medidor;

/**
 *
 * @author pc
 */
public class Vehiculo {
    String tipo;
    String marca;
    int velocidad;
    int año;
    
    public Vehiculo (String tipo, String marca, int velocidad, int año){
        
        this.tipo = tipo;
        this.marca = marca;
        this.velocidad = velocidad;
        this.año = año;
        
        if(this.velocidad > 50)
            System.out.println("Este vehículo va a "+this.velocidad + " km/h por lo que será multado.");
        else;
           
    }
    
}
