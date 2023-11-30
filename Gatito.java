/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gato;

/**
 *
 * @author pc
 */
public class Gatito {
   String  nombre;
   String  raza;
    int edad;
    
    public Gatito (String nombre, int edad, String raza){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void maullar (){
        System.out.println(this.nombre + " empezo a maullar ");
    }
    
    public void arañar (){
        System.out.println(this.nombre + " empezo a arañar ");
    }
    
    public void trepar (){
        System.out.println(this.nombre + " empezo a trepar ");
    }   
}
