package ClassWork;

public class Main {

    public  static <T> void fas(T num) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args) {


    }

}

