package HomeWork.Result01;
import java.util.Random;
public class Hotel {

    Random rand = new Random();
    private String name;
    private String city;
    private int rooms;
    private int free;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getRooms() {
        return rooms;
    }

    public int getFree() {
        return free;
    }

    public Hotel(String name, String city, int rooms, int free) {
        this.name = name;
        this.city = city;
        this.rooms = rooms;
        this.free = free;
    }

    public Hotel() {
        this.name = "NA";
        this.city = "NA";
        this.rooms = rand.nextInt(125);
        this.free = rand.nextInt(125);
    }

    public void SetFree(int num) {
        this.free = num;
    }

    public void SetData(String name, String city, int rooms, int free) {
        this.name = name;
        this.city = city;
        this.rooms = rooms;
        this.free = free;
    }

    public void Print() {
        System.out.println("-----------------------------");
        System.out.println("The Name is " + this.name);
        System.out.println("The city is " + this.city);
        System.out.println("The number of rooms " + this.rooms);
        System.out.println("The number of free rooms " + this.free);
        System.out.println("-----------------------------");
        System.out.println();
    }
}
