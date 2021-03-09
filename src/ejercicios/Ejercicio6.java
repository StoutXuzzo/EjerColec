/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayDeque;
import javax.swing.JOptionPane;

/**
 *
 * @author stout
 */
public class Ejercicio6 {
    public static void main(String[]args){
        ArrayDeque<String> daw = new ArrayDeque();
        String alumnos = "";
        daw.add("Pedro");
        daw.add("Julian");
        daw.add("Eustakio");
        
        daw.addLast(JOptionPane.showInputDialog(null, "Nombre:", "Matricula DAW", JOptionPane.QUESTION_MESSAGE));
        
        for(String alumno : daw)
            alumnos = alumnos + alumno + "\n";
        
        JOptionPane.showMessageDialog(null, alumnos, daw.size() + " alumnos en cola", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, daw.getLast(), "Ultimo en cola", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, daw.pollFirst(), "Alumno admitido", JOptionPane.INFORMATION_MESSAGE);
        
        alumnos = "";
        for(String alumno : daw)
            alumnos = alumnos + alumno + "\n";
        
        JOptionPane.showMessageDialog(null, alumnos, daw.size() + " alumnos en cola", JOptionPane.INFORMATION_MESSAGE);     
    }
}
