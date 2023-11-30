/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animales;

/**
 *
 * @author pc
 */
public class Animales {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Perro perr = new Perro("Jachico", 5, "Chihuahua");
        perr.saltar();
        perr.comer();
        perr.correr();
    }
}
