/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.*;

/**
 *
 * @author stout
 */
public class Ejercicio1 {
    public static void main(String[]args){
        // DEFINIMOS UN "HashSet" DE OBJETOS TIPO "String"
        HashSet<String> memoria = new HashSet();
        
        // AÑADIMOS "OBJETOS" EN LA MEMORIA MEDIANTE ".add()"
        memoria.add("Alcatel");
        memoria.add("Xiaomu");
        memoria.add("Samsung");
        memoria.add("Motorola");
        memoria.add("Apple");
        
        // MOSTRAMOS TODOS LOS OBJETOS EN MEMORIA
        System.out.println("Introducido:");
        for(String marca : memoria){
            System.out.println(marca);
        }
        
        // MOSTRAMOS EL TAMAÑO DE LA MEMORIA
        System.out.println("\nHay " + memoria.size() + " elementos en el HashSet");
        
        // COMPROBAMOS SI LA MEMORIA CONTIENE "Samsung" o no, mediante ".contains("Samsung")"
        System.out.println("Samsung " + ((memoria.contains("Samsung"))?"":"no ") + "esta en la lista");
        
    }
}
