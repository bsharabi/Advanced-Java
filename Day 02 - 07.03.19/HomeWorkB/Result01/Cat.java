package HomeWorkB.Result01;

public  class Cat {

    //------------------------Properties----------------------------
    private int catKg;
    private String nameCat;
    private int numberCat;
    private int priceCat;
    //------------------------Constructor----------------------------
    public Cat(int catKg, String nameCat, int numberCat, int priceCat) {
        this.catKg = catKg;
        this.nameCat = nameCat;
        this.numberCat = numberCat;
        this.priceCat = priceCat;
    }
    //------------------------Function----------------------------
    public int getCatKg() {
        return catKg;
    }

    public void setCatKg(int catKg) {
        this.catKg = catKg;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getNumberCat() {
        return numberCat;
    }

    public void setNumberCat(int numberCat) {
        this.numberCat = numberCat;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    public boolean isLower(int x)
    {
        if(catKg<x)
            return true;
        return false;
    }

    public boolean isItforMe(int x,int y)
    {
        if(isLower(x)&&priceCat<y)
            return true;
        return false;
    }
}
