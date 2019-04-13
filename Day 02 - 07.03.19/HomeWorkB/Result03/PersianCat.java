package HomeWorkB.Result03;

import HomeWorkB.Result01.Cat;

public class PersianCat extends Cat {

    private char catIndex;

    public PersianCat(int catKg, String nameCat, int numberCat, int priceCat) {
        super(catKg, nameCat, numberCat, priceCat);
        rateTheCat();
    }

    public char getCatIndex() {
        return catIndex;
    }

    public void setCatIndex(char catIndex) {
        this.catIndex = catIndex;
    }

    public void rateTheCat() {
        float price = (getPriceCat() * (getNumberCat() % 100)) / 30;
        if (price < 200)
            this.catIndex = 'a';
        else if (price > 200 && price < 1000)
            this.catIndex = 'b';

        else
            this.catIndex = 'c';

    }
    @Override
    public String toString()
    {
        return "nameCat " + getNameCat()+" catKg "+getCatKg()+" numberCat "+getNumberCat()+" priceCat " +getPriceCat()+" CatIndex "+getCatIndex();
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof PersianCat) {
            PersianCat f = (PersianCat) o;
            if (f.getCatIndex()==this.getCatIndex()) {
                return true;
            }
        }

        return false;
    }

}
