/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

/**
 *
 * @author pc
 */
public class Perro {
   String  nombre;
   String  raza;
    int edad;
    
    public Perro (String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void saltar (){
        System.out.println(this.nombre + " empezo a saltar ");
    }
    
    public void comer (){
        System.out.println(this.nombre + " empezo a comer ");
    }
    
    public void correr (){
        System.out.println(this.nombre + " empezo a correr ");
    } 
}
