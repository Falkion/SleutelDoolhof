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
                System.out.println("Left pressed");
                if(this.checkFreeSpace(speelveld, grid, n)) {
                    this.setXpos(n[0]);
                    this.setYpos(n[1]);
                    System.out.println("Player moved left");
                }
                break;
            case 38: // up
                n[1] -= 1;
                System.out.println("Up pressed");
                if(this.checkFreeSpace(speelveld, grid, n)) {
                    this.setXpos(n[0]);
                    this.setYpos(n[1]);
                    System.out.println("Player moved up");
                }
                break;
            case 39: // right
                n[0] += 1;
                System.out.println("Right pressed");
                if(this.checkFreeSpace(speelveld, grid, n)) {
                    this.setXpos(n[1]);
                    this.setYpos(n[0]);
                    System.out.println("Player moved right");
                }
                break;
            case 40: // down
                n[1] += 1;
                System.out.println("Down pressed");
                if(this.checkFreeSpace(speelveld, grid, n)) {
                    this.setXpos(n[0]);
                    this.setYpos(n[1]);
                    System.out.println("Player moved down");
                }
                break;
            default:
        }
    }

    /**
     * returns true if theres a free space
     * 
     * @param speelveld
     * @param grid
     * @param space
     * @return 
     */
    public boolean checkFreeSpace(Speelveld speelveld, String[][][] grid, int[] space) {
        if((space[0] >= 0) && (space[0] < speelveld.getVlakBreedte())
            && ((space[1] >= 0) && (space[1] < speelveld.getVlakBreedte()))) {
            if("Leegvlak".equals(grid[space[0]][space[1]][0])) {
                return true;
            } else {
                System.out.println("fs: Space busy");
                return false;
            }
        } else {
            System.out.println("fs: out of bounds!");
            return false;
        }
    }
    
    public void SleutelOppakken(boolean huidigeSleutel) {

    }

    public void checkWinCondities(boolean Eindveld) {

    }
}
