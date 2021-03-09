/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author stout
 */
public class Ejercicio5 {
    public static void main(String[]args){
        HashMap<Integer, Persona> personas = new HashMap();
        int contador = 0;
        
        Persona p = new Persona("Pedro", 26);
        personas.put(++contador, p);
        
        Persona j = new Persona("Juanjo", 21);
        personas.put(++contador, j);
        
        Persona r = new Persona("Roberto", 20);
        personas.put(++contador, r);
        
        Persona e = new Persona("Eustakio", 63);
        personas.put(++contador, e);
        
        Persona u = new Persona("Umberto", 17);
        personas.put(++contador, u);
        
        System.out.println("1.- INTRODUCCION DE ELEMENTOS:\n");
        /*for(Map.Entry persona : personas.entrySet())
            System.out.println(persona.getKey() + " - " + persona.getValue());*/
        for(int cod : personas.keySet())
            System.out.println(cod + " - " + personas.get(cod));
        
        System.out.println("");
        
        System.out.println("2.- MOSTRAR NUMERO DE ELEMENTOS:\n");
        System.out.println("Hay " + personas.size() + " personas en la memoria.");
           
        System.out.println("");
        
        System.out.println("3.- ELIMINAR UN ELEMENTO:\n");
        personas.remove(4);
        for(Map.Entry persona : personas.entrySet())
            System.out.println(persona.getKey() + " - " + persona.getValue());
        
        System.out.println("");
        
        System.out.println("4.- REMPLAZAR ELEMENTO:\n");
        personas.replace(3, e);
        for(Map.Entry persona : personas.entrySet())
            System.out.println(persona.getKey() + " - " + persona.getValue());
        
        System.out.println("");
        
        System.out.println("5.- RECUPERAR UN VALOR:\n");
        System.out.println(personas.get(3));
        
        System.out.println("6.- RECUPERA NOMBRE Y EDAD DE FORMA INDEPENDIENTE:\n");
        System.out.println("5 - " + personas.get(5).getNombre());
        System.out.println("5 - " + personas.get(5).getEdad());
        
        System.out.println("");
        
        System.out.println("7.- USA ENTRYSET Y MUESTRA TODO:\n");
        for(Map.Entry persona : personas.entrySet())
            System.out.println(persona.getKey() + " - " + persona.getValue());
        
        System.out.println("");
        
        System.out.println("8.- ITERA CON ENTRYSET:\n");
        Iterator iter = personas.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry persona = (Map.Entry) iter.next();
            System.out.println("Clave:" + persona.getKey() + " Valor=" + persona.getValue());
        }
    }
}
class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    @Override
    public String toString(){
        return "[" + nombre + ", " + edad + "]";
    }
}