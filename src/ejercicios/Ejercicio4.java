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
public class Ejercicio4 {
    public static void main(String[]args){
        HashMap<String, Integer> memoria = new HashMap();
        
        System.out.println(" - AÑADIR 12 MESES -");
        memoria.put("Enero", 31); 
        memoria.put("Febrero", 28);
        memoria.put("Marzo", 31);
        memoria.put("Abril", 30);
        memoria.put("Mayo", 31);
        memoria.put("Junio", 30);
        memoria.put("Julio", 31);
        memoria.put("Agosto", 31);
        memoria.put("Septiembre", 30);
        memoria.put("Octubre", 31);
        memoria.put("Noviembre", 30);
        memoria.put("Diciembte", 31);
        memoria.put("Inventado", 100);
        
        for(String clave : memoria.keySet())
            System.out.println(clave + " - " + memoria.get(clave));
        
        System.out.println("");
        
        System.out.println(" - MOSTRAR NUMERO DE ELEMENTOS - ");
        System.out.println("Hay " + memoria.size() + " elementos en la memoria." + "\n");
        
        System.out.println(" - REMPLAZAR -");
        System.out.println(memoria.get("Inventado"));
        memoria.replace("Inventado", 200);
        for(String clave : memoria.keySet())
            System.out.println(clave + " - " + memoria.get(clave));
        
        System.out.println(" - BORRAR INVENTADO -");
        memoria.remove("Inventado");
        for(String clave : memoria.keySet())
            System.out.println(clave + " - " + memoria.get(clave));
        
        System.out.println(" - OBTENER NUMERO DE DIAS DE ABRIL -");
        System.out.println(memoria.get("Abril") + "\n");
        
        System.out.println(" - MOSTRAR ENTRYSET -");
        for(Map.Entry entrada : memoria.entrySet())
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        
        /*for(String clave : memoria.keySet())
            System.out.println(clave);*/
        
        System.out.println("");
        
        System.out.println(" - ITERAR SOBRE KEYSET -");
        
        Iterator iter1 = memoria.keySet().iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next());
        }
        /*for(String clave : memoria.keySet())
            System.out.println(memoria.get(clave));*/
        
        System.out.println("");
        
        System.out.println(" - ITERA SOBRE EL VALOR NO CLAVE -");
        /*for(int valor : memoria.values())
            System.out.println(valor);*/
        Iterator iter2 = memoria.values().iterator();
        while(iter2.hasNext()){
            System.out.println(iter2.next());
        }
        
        
        System.out.println("");
        
        System.out.println(" - MUESTRA TODO -");        
        Iterator iter3 = memoria.entrySet().iterator();
        
        while(iter3.hasNext()){
            Map.Entry elemento = (Map.Entry) iter3.next();
            System.out.println(elemento.getKey() + " (" + elemento.getValue() + ")");
        }
    }
}
