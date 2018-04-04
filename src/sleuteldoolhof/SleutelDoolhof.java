/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleuteldoolhof;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author nebbii
 */
public class SleutelDoolhof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 650);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 10, 5, 5));
        
   }
    
}
