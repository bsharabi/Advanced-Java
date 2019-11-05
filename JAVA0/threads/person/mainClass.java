package threads.person;

public class mainClass {
    public static void main(String[] args) {
        Place p1 = new Place();
        Place p2 = new Place();
        Place p3 = new Place();
        Place p4 = new Place();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            p1.print();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

        }


    }
}
