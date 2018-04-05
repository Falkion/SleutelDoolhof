package sleuteldoolhof;

public class Speler extends VlakObject
{
    private boolean huidigeSleutel;
    
    public Speler(int x, int y) {
        this.setXpos(x);
        this.setYpos(y);
    }
    
    public void setHuidigeSleutel(boolean Sleutel) {
       this.huidigeSleutel = huidigeSleutel; 
    }

    public boolean getHuidigeSleutel() {
       return this.huidigeSleutel; 
    }

    public void move(Speelveld speelveld, String[][][] grid, int key) {
        // n is next space
        int[] n = new int[2];
        n[0] = this.getXpos();
        n[1] = this.getYpos();
        
        switch(key) {
            case 37: // left
                n[0] -= 1;
                if(grid[n[0]][n[1]][0] == "") {
                    
                }
                break;
            case 38: // up
                n[0] -= 1;
                if(grid[n[0]][n[1]][0] == "") {
                    
                }
                break;
            case 39: // right
                n[0] += 1;
                if(grid[n[0]][n[1]][0] == "") {
                    
                }
                break;
            case 40: // down
                n[1] += 1;
                if(grid[n[0]][n[1]][0] == "") {
                    
                }
                break;
            default:
        }
    }

    public void SleutelOppakken(boolean huidigeSleutel) {

    }

    public void checkWinCondities(boolean Eindveld) {

    }
}
