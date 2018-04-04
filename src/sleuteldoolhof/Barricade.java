package sleuteldoolhof;

public class Barricade extends VlakObject
{
    private int slotwaarde;

    // staat 1 betekent heel, 0 gebroken
    private boolean staat;

    public Barricade(int slotwaarde) {
        this.slotwaarde = slotwaarde;
        this.staat = true;
    }

    public int getSlotwaarde() {
        return this.slotwaarde;
    }

    public boolean getStaat() {
        return this.staat;
    }
}

