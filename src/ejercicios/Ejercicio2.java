/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashSet;

/**
 *
 * @author stout
 */
public class Ejercicio2 {
    public static void main(String[]args){
        HashSet<String> cochesNoJaponeses = new HashSet();
        HashSet<String> cochesJaponeses = new HashSet();
        HashSet<String> coches = new HashSet();
        
        cochesNoJaponeses.add("Citroen");
        cochesNoJaponeses.add("Ford");
        cochesNoJaponeses.add("Seat");
        cochesNoJaponeses.add("Volvo");
        cochesNoJaponeses.add("BMW");
        
        cochesJaponeses.add("Toyota");
        cochesJaponeses.add("Hyundai");
        cochesJaponeses.add("Mitsubishi");
        
        System.out.println("COCHES NO JAPONESES:");
        for(String marca : cochesNoJaponeses)
            System.out.println(marca);
        
        System.out.println("");
        
        System.out.println("COCHES JAPONESES:");
        for(String marca : cochesJaponeses)
            System.out.println(marca);
        
        System.out.println("");
        
        coches.addAll(cochesNoJaponeses);
        coches.addAll(cochesJaponeses);
        
        System.out.println("COCHES:");
        for(String marca : coches)
            System.out.println(marca);
        
        System.out.println("");
        
        System.out.println("ELIMINO Seat Y PONGO SEAT:");
        coches.remove("Seat");
        coches.add("SEAT");
        
        for(String marca : coches)
            System.out.println(marca);
        
        System.out.println("");
        
        System.out.println("Hay un total de " + coches.size() + " coches.");
        
        
        
    }
}
