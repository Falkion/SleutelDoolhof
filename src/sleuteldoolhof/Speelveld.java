/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleuteldoolhof;

/**
 *
 * @author Ben
 */
public class Speelveld {
    private int vlak_hoogte;
    private int vlak_breedte;
    
    public Speelveld(int vh, int vb) {
        this.vlak_hoogte = vh;
        this.vlak_breedte = vb;
    }
    
    public String[][][] reset() {
        return laadPuzzel1();
    }
    
    public String[][][] nukeGrid(String[][][] grid) {
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                grid[i][j][0] = "LeegVlak";
            }
        }
        return grid;
    }
    
    
    public String[][][] laadPuzzel1() {
        String[][][] puzzel = new String[10][10][5];
        
        // legevlakken overal
        puzzel = nukeGrid(puzzel);
        
        // walls
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++) {
                if(i==0 || j==0) {
                    puzzel[i][j][0] = "VasteMuur";
                }
            }
        }
        
        // speler
        puzzel[4][4][0] = "Speler";
        
        return puzzel;
    }
    
    public String[][][] laadPuzzel2() {
        String[][][] puzzel = new String[10][10][5];
        return puzzel;
    }
    
    public String[][][] laadPuzzel3() {
        String[][][] puzzel = new String[10][10][5];
        return puzzel;
    }
    
    public int getVlakHoogte() {
        return vlak_hoogte;
    }

    public int getVlakBreedte() {
        return vlak_breedte;
    }
}
