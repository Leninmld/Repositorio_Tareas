/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lemi;

/**
 *
 * @author pc
 */
public class Persona {
    private String  nombre;
    private int edad;
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void saltar (){
        System.out.println(this.nombre + " Empezo a saltar ");
    }
    
    public void comer (){
        System.out.println(this.nombre + " Empezo a comer ");
    }
    
    public void correr (){
        System.out.println(this.nombre + " Empezo a correr ");
    }
}

