/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafetera;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cafe> colaCafes = new ArrayList<>();
        Metodos creacion = new Metodos();

        Cafe cafe = new Cafe(creacion.elegirAzucar(), creacion.elejirCafe());
        colaCafes.add(cafe);

        JOptionPane.showMessageDialog(null, "creando cafe... Espere");

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cafetera.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Puede retirar el cafe.");
    }

}
