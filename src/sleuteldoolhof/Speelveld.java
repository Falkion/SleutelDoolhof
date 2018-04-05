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
    
    public int getVlakHoogte() {
        return vlak_hoogte;
    }

    public int getVlakBreedte() {
        return vlak_breedte;
    }
}
