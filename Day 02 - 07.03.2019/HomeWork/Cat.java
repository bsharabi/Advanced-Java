package HomeWork;

public class Cat {

    private int age;
    protected String noise = "miaooo";

    public Cat(int age){
        this.age = age;
    }
    public int getAge(){return age;}

    public String getNoise(){return noise;}

    public void makeNoise(){
        System.out.println("my cat makes "+getNoise());
    }
    public String whoIs(){return "my cat age "+getAge();}

    public String getClassName(){return "cat";}

}
