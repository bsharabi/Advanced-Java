package HomeWork.Result02;

public class Shop {

    private String name;
    private float banana;
    private float apple;
    private float orange;

    public String getName() {
        return name;
    }

    public float getBanana() {
        return banana;
    }

    public float getApple() {
        return apple;
    }

    public float getOrange() {
        return orange;
    }

    public Shop(String name, float banana, float apple, float orange) {
        this.name = name;
        this.banana = banana;
        this.apple = apple;
        this.orange = orange;
    }
    public Shop() {
        this.name = "NA";
        this.banana = 0;
        this.apple = 0;
        this.orange = 0;
    }

    public void SerData(String name, float banana, float apple, float orange){
        this.name = name;
        this.banana = banana;
        this.apple = apple;
        this.orange = orange;
    }

    public void Print(){
        System.out.println("------------------------------");
        System.out.println("The Name is "+this.name);
        System.out.println("The amount of banana " + this.banana );
        System.out.println("The amount of apple " + this.apple );
        System.out.println("The amount of orange " +  this.orange);
        System.out.println("------------------------------");
    }

}
