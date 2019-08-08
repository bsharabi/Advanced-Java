package HomeWork;

public class Main {

    public static void main(String[] args) {

        AB a =new AB(2);
        AB b =new AB(2);
        AB c =new AB(2);
        a.start();
        b.start();
        c.start();
        try {
            a.join();
            b.join();
            c.join();

        }
        catch(InterruptedException e)
        {
        e.printStackTrace();
        }

    }
}
