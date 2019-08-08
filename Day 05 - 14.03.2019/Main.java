package ClassWork;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Place());
        Thread t2 = new Thread(new Place());
        Thread t3 = new Thread(new Place());
    }
}
