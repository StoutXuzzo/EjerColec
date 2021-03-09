/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author stout
 */
public class Ejercicio3 {
    public static void main(String[]args){
        HashSet<String> personajesDBS = new HashSet();
        HashSet<String> suplentesDBS = new HashSet();
        String pjs = "", pjsS = "", input = "";
        
        personajesDBS.add("Goku");
        personajesDBS.add("Vegeta");
        personajesDBS.add("Gohan");
        personajesDBS.add("A-18");
        personajesDBS.add("Piccolo");
        personajesDBS.add("A-17");
        personajesDBS.add("Krillin");
        personajesDBS.add("Roshi");
        personajesDBS.add("Bu");
        personajesDBS.add("Tenshinhan");
        
        for(String pj : personajesDBS)
            pjs = pjs + pj + "\n";
        
        JOptionPane.showMessageDialog(null, pjs, "Personajes", JOptionPane.INFORMATION_MESSAGE);
            
        input = JOptionPane.showInputDialog(null, "Introduce un personaje:", "Buscar personaje", JOptionPane.QUESTION_MESSAGE);
        
        if(personajesDBS.contains(input)) JOptionPane.showMessageDialog(null, input + " esta en el equipo", "Personaje encontrado", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, input + " no esta en el equipo", "Personaje no encontrado", JOptionPane.ERROR);
        
        suplentesDBS.add("Freeza");
        suplentesDBS.add("Gotenks");
        
        for(String pjS : suplentesDBS)
            pjsS = pjsS + pjS + "\n";
        
        JOptionPane.showMessageDialog(null, pjs, "Titulares", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, pjsS, "Suplentes", JOptionPane.INFORMATION_MESSAGE);
        
        input = JOptionPane.showInputDialog(null, "Introduce un personaje", "Buscar personaje", JOptionPane.QUESTION_MESSAGE);
        
        if(personajesDBS.contains(input)) JOptionPane.showMessageDialog(null, input + " es titular", "Personaje encontrado", JOptionPane.INFORMATION_MESSAGE);
        else if(suplentesDBS.contains(input)) JOptionPane.showMessageDialog(null, input + " es suplente", "Personaje encontrado", JOptionPane.INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(null, input + " no esta en el equipo", "Personaje no encontrado", JOptionPane.ERROR);
        
        personajesDBS.addAll(suplentesDBS);
        suplentesDBS.removeAll(suplentesDBS);
        
        pjs = "";
        for(String pj : personajesDBS)
            pjs = pjs + pj + "\n";
        
        pjsS = "";
        for(String pjS : suplentesDBS)
            pjsS = pjsS + pjS + "\n";
        
        JOptionPane.showMessageDialog(null, pjs, "Titulares", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, pjsS, "Suplentes", JOptionPane.INFORMATION_MESSAGE);
    }   
}
