package Q3;

public class NewItem extends Item {

    private int bonus;

    public NewItem(String name, double catalog, double price, int bonus) {
        super(name, catalog, price);
        this.bonus = bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public double Cost(int n) {
        if(n<100)
            return n*getPrice();
        return ((n-100) *getPrice()*(100/bonus))+(100*getPrice()* (100/bonus));
    }

//    public double NewCost(int n) {
//        if(n<100)
//            return n*getPrice();
//        else if(n>100 && n <= 200)
//            return getPrice() * (100/bonus);
//        else if()
//    }

}
