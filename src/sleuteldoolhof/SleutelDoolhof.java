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
        JFrame frame = new JFrame("Sleutel Doolhof");
        JPanel panel = new JPanel();
        
        // create speelveld
        Speelveld speelveld = new Speelveld(10, 10);
        
        String[][][] vlakItems = new String[10][10][5];
        
        vlakItems = speelveld.laadPuzzel1();
        
        panel.setLayout(new GridLayout(speelveld.getVlakBreedte(), speelveld.getVlakHoogte(), 5, 5));
        
        // create jlabel array
        JLabel gridLabels[][] = new JLabel[10][10];
        
        // render ik field
        for(int i=0;i < speelveld.getVlakBreedte(); i++) {
            for(int j=0; j < speelveld.getVlakHoogte(); j++) {
                System.out.print("X:"); System.out.print(i);System.out.print("Y:");System.out.println(j);
                gridLabels[i][j] = new JLabel(vlakItems[i][j][0]);
            }
        }
        
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        // voeg jlabels toe aan grid
        for(int i=0;i < speelveld.getVlakBreedte(); i++) {
            for(int j=0; j < speelveld.getVlakHoogte(); j++) {
                panel.add(gridLabels[i][j]);
            }
        }

        frame.add(panel);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 650);
        
   }
}
