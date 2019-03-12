package HomeWork.Result03;

public class Item {

    private long catalog;
    private String name;
    private float price;

    public long getCatalog() {
        return catalog;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Item(long catalog, String name, float price) {
        this.catalog = catalog;
        this.name = name;
        this.price = price;
    }

    public Item() {
        this.catalog = 0;
        this.name = "NA";
        this.price = 0;
    }

    public void Print()
    {
        System.out.println("The name is :"+ this.name + "\nThe catalog is :" +this.catalog + "\nThe price is:" +this.price+"\n");
    }
    public void Set(long catalog, String name, float price)
    {
        this.catalog = catalog;
        this.name = name;
        this.price = price;
      //  System.out.println("What is the name of your item? :");
       // System.out.println("What is the catalog? :");
      //  System.out.println("What is the price of your item?:");
    }
    public float Coat(int N)
    {
       return N*this.price;
    }


}
