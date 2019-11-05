package Q3;

public class Item {
    private String name;
    private double catalog;
    private double price;

    //-----------getters


    public String getName() {
        return name;
    }

    public double getCatalog() {
        return catalog;
    }

    public double getPrice() {
        return price;
    }

    public Item(String name, double catalog, double price) {
        this.name = name;
        this.catalog = catalog;
        this.price = price;
    }

    public Item() {
        this.name = "";
        this.catalog = 0;
        this.price = 0;
    }

    @Override
    public String toString() {
        return "Catalog id: " + catalog + "\nName: " + name + "\nPrice: " + price;
    }

    public void setItem(String name, double catalog, double price) {
        this.name = name;
        this.catalog = catalog;
        this.price = price;
    }

    public double Cost(int n) {
        return n * price;
    }


}
