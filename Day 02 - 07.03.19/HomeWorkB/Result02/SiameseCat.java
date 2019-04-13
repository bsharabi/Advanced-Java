package HomeWorkB.Result02;
import HomeWorkB.Result01.Cat;

public class SiameseCat extends Cat {


    private char color;

    public SiameseCat(int catKg, String nameCat, int numberCat, int priceCat, char color) {
        super(catKg, nameCat, numberCat, priceCat);
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "nameCat " + getNameCat()+" catKg "+getCatKg()+" numberCat "+getNumberCat()+" priceCat " +getPriceCat()+" color "+getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SiameseCat) {
            SiameseCat f = (SiameseCat) o;
            if (f.getColor()==color && f.getNumberCat()==getNumberCat()) {
                return true;
            }
        }

        return false;
    }

}
