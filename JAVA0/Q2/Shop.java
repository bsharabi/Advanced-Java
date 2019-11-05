package Q2;

public class Shop {

    private String name;
    private double banana;
    private double apple;
    private double orange;

    // --------------Functions--------------------------

    //---------------getters----------------------------
    public String getName() {
        return name;
    }

    public double getBanana() {
        return banana;
    }

    public double getApple() {
        return apple;
    }

    public double getOrange() {
        return orange;
    }
    //---------------setter-----------------------------

    public void setData(String name,double banana, double apple, double orange) {
        this.name = name;
        this.banana = banana;
        this.apple = apple;
        this.orange = orange;
    }
    @Override
    public String toString(){

        return "Shop name: "+name+"\nBanana Price: "+banana+"\nApple Price: "+apple+"Orange Price: "+orange;
    }

    // --------------Constructor------------------------


    public Shop(String name, double banana, double apple, double orange) {
        this.name = name;
        this.banana = banana;
        this.apple = apple;
        this.orange = orange;
    }
    public Shop() {
        this.name = "Na";
        this.banana = 0;
        this.apple = 0;
        this.orange = 0;
    }


}
