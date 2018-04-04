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
        
        int xSize = 10;
        int ySize = 10;
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(xSize, ySize, 5, 5));
        
        JLabel gridLabels[][] = new JLabel[10][10];
        for(int i=0;i<xSize;i++) {
            for(int j=0;j<ySize;j++) {
                String label = Integer.toString(i) + Integer.toString(j);
                System.out.print("X:");
                System.out.print(i);
                System.out.print("Y:");
                System.out.println(j);
                gridLabels[i][j] = new JLabel(label);
            }
        }
        
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        for(int i=0;i<xSize;i++) {
            for(int j=0;j<ySize;j++) {
                panel.add(gridLabels[i][j]);
            }
        }
        
        
        frame.add(panel);
   }
    
}
