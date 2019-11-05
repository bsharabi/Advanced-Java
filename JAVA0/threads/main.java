package threads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class main {


    public static void main(String[] args) {

//            AB a = new AB(1);
//            AB b = new AB(2);
//
//            a.start();
//
//            b.start();
//            System.out.println("inside "+Thread.currentThread().getName());
//        try {
//            a.join();
//            b.join();
//            System.out.println("end of main");
//        }catch(InterruptedException e){
//            System.out.println(e.getStackTrace());
//        }



        runable r = new runable(0);

        Thread r1 = new Thread(r);
        Thread r2 = new Thread(new runable(3));
        Thread r3 = new Thread(new runable(6));
        r1.start();
        r2.start();
        r3.start();

        try {
            r1.join();
            r2.join();
            r3.join();

            r.print();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
