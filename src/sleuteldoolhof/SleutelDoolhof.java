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
        JPanel panel = new JPanel();
        
        // create speelveld
        Speelveld speelveld = new Speelveld(10, 10);
        
        String[][][] vlakItems = new String[10][10][5];
        
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
    
    public char[][][] laadPuzzel1() {
        String[][][] puzzel = new String[0][10][10][5];
        
        for(int i=0;i<10;i++) {
            puzzel[i][0][0] = "VasteMuur";
        }
        
        return puzzel;
    }
    
    public char[][][] laadPuzzel2() {
        String[][][] puzzel = new String[10][10][5];
        return puzzel;
    }
    
    public char[][][] laadPuzzel3() {
        String[][][] puzzel = new String[10][10][5];
        return puzzel;
    }
    
}
