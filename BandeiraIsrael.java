/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandeiraIsrael;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author eliananeto
 */
public class BandeiraIsrael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        
        estrelinha x = new estrelinha();
        
        frame.setSize(600, 600);
        x.setSize(600, 600);
        
       
       //x.setBackground(Color.BLACK);
        
        
        frame.setVisible(true);
        x.setVisible(true);
        
       
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(x);

    }
    
}
