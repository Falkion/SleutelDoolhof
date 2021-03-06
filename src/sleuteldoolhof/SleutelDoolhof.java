/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleuteldoolhof;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Sleutel doolhof spel gemaakt voor school!
 * 
 * TODO:
 * - grid redrawing
 * - grafische aspect
 * - sleutels kunnen oppakken 
 * - barricades kunnen openmaken
 * - collisie met barricades
 * - spel kunnen winnen door op eindveld te staan
 *
 * @author nebbii
 * 
 * @repository https://github.com/nebbii/SleutelDoolhof
 */
public class SleutelDoolhof {
    
    Speelveld speelveld;
    JFrame frame;
    JPanel panel;
    
    JLabel[][] gridLabels;
    String[][][] vlakItems;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Creating! */
        JFrame frame = new JFrame("Sleutel Doolhof");
        JPanel panel = new JPanel();
        
        // load images
        ImageIcon ImgVasteMuur = new ImageIcon(".\\src\\sleuteldoolhof\\Images\\VasteMuur.png");
        ImageIcon ImgLeegvlak = new ImageIcon(".\\src\\sleuteldoolhof\\Images\\Leegvlak.png");
        ImageIcon ImgSpeler = new ImageIcon(".\\src\\sleuteldoolhof\\Images\\Speler.png");
        ImageIcon ImgEindvlak = new ImageIcon(".\\src\\sleuteldoolhof\\Images\\Eindvlak.png");
        
        // create speelveld
        // source: https://www.youtube.com/watch?v=3cuVqLxNBbc
        Speelveld speelveld = new Speelveld(10, 10);
        
        panel.setLayout(new GridLayout(speelveld.getVlakBreedte(), speelveld.getVlakHoogte(), 5, 5));
        
        // create jlabel array
        JLabel gridLabels[][] = new JLabel[10][10];
        
        // place jlabels in grid
        for(int i=0;i < speelveld.getVlakBreedte(); i++) {
            for(int j=0; j < speelveld.getVlakHoogte(); j++) {
                gridLabels[i][j] = new JLabel(speelveld.vlakItems[i][j][0]);
            }
        }
        
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        // voeg jlabels toe aan grid
        for(int i=0;i < speelveld.getVlakBreedte(); i++) {
            for(int j=0; j < speelveld.getVlakHoogte(); j++) {
                panel.add(gridLabels[j][i]);
                switch(speelveld.vlakItems[j][i][0]) {
                    case "VasteMuur":
                        gridLabels[j][i].setIcon(ImgVasteMuur);
                        break;
                    case "Leegvlak":
                        gridLabels[j][i].setIcon(ImgLeegvlak);
                        break;
                    case "Speler":
                        gridLabels[j][i].setIcon(ImgSpeler);
                        break;
                    case "Eindvlak":
                        gridLabels[j][i].setIcon(ImgEindvlak);
                        break;
                    default:
                }
            }
        }
        
        // create player
        Speler speler = new Speler(0, 0);
        
        /* End Creating! */
        /* Rendering! */
        
        // arrow controls!
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                /**
                 * left=37
                 * up=38
                 * right=39
                 * down=40
                 */
                speelveld.vlakItems = speler.move(speelveld, e.getKeyCode());
                
                //speelveld.vlakItems[speler.getXpos()][speler.getYpos()][0] = "Speler";
                
                for(int i=0;i < speelveld.getVlakBreedte(); i++) {
                    for(int j=0; j < speelveld.getVlakHoogte(); j++) {
                        gridLabels[j][i].setText(speelveld.vlakItems[j][i][0]);
                         switch(speelveld.vlakItems[j][i][0]) {
                            case "VasteMuur":
                                //System.out.print("M");
                                gridLabels[j][i].setIcon(ImgVasteMuur);
                                break;
                            case "Leegvlak":
                                //System.out.print(".");
                                gridLabels[j][i].setIcon(ImgLeegvlak);
                                break;
                            case "Speler":
                                //System.out.print("S");
                                gridLabels[j][i].setIcon(ImgSpeler);
                                break;
                            case "Eindvlak":
                                //System.out.print("E");
                                gridLabels[j][i].setIcon(ImgEindvlak);
                                break;
                            default:
                                //System.out.print("N");
                        }
                    }
                    //System.out.println("");
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        
        frame.add(panel);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 650);
   }
}
