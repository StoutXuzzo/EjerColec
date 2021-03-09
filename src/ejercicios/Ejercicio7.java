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
public class Ejercicio7 {
    public static void main(String[]args){
        ArrayDeque<String> pedidos = new ArrayDeque();
        int input = -1;
        
        do{
            input = JOptionPane.showOptionDialog(null, "Acciones", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Introducir pedido", "Nº de pedidos activos", "Ver primer pedido", "Servir pedido", "Salir"}, null);
            
            switch(input){
                case 0:
                    pedidos.addLast(JOptionPane.showInputDialog(null, "Introduce el producto", "Introducir pedido", JOptionPane.INFORMATION_MESSAGE));
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Hay " + pedidos.size() + " en la cola", "Nº de pedidos activos", JOptionPane.INFORMATION_MESSAGE);
                 break;
                case 2:
                   JOptionPane.showMessageDialog(null, "El primer pedido en cola es " + pedidos.peekFirst(), "Ver primer pedido", input);
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null, "Se ha servido el pedido de " + pedidos.pollFirst(), "Servir pedido", JOptionPane.INFORMATION_MESSAGE);
            }
        }while(input!=4 && input!=-1);
    }
}
