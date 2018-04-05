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
    
    public void reset() {
        
    }
    
    public String[][][] laadPuzzel1() {
        String[][][] puzzel = new String[10][10][5];
        
        // borders
        for(int i=0;i<10;i++) {
            puzzel[i][0][0] = "Leegvlak";
        }
        for(int i=0;i<10;i++) {
            puzzel[0][i][0] = "Leegvlak";
        }
        
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
