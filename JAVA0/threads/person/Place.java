package threads.person;

import java.util.Random;
import java.util.Scanner;

public class Place implements Runnable {
    static Random rnd = new Random();
    static Person[] p = new Person[12];
    static Person[][] p2 = new Person[4][4];
    static int place = 0;
    static int ii = 0;
    static int j = 0;
    static int cnt = 0;

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("enter name");
//            String name = input.nextLine();
//            System.out.println("enter id");
//
//            String id = input.nextLine();
//            System.out.println("enter age");
//
//            int age = input.nextInt();
//            input.next();
            //add_place(name, id, age);
            add_place("a1" + ii, "22" + j, cnt++);
        }
//        for (int i = 0; i < 4; i++) {
////            Scanner input = new Scanner(System.in);
////            System.out.println("enter name");
////            String name = input.nextLine();
////            System.out.println("enter id");
////
////            String id = input.nextLine();
////            System.out.println("enter age");
////
////            int age = input.nextInt();
////            input.next();
//
//            //add_place(name, id, age);
//            add_place("a1"+ii,"22"+j,cnt++);
//        }

    }

    private static synchronized void add_place(String name, String id, int age) {
        int idx = (int) (Math.random()*10);//rnd.nextInt(12);
        if (p[idx]==null)
            p[idx] = new Person(name, id, age);
        else {
            System.out.println(idx + " not empty\n");
            try {
                add_place("a1" + ii, "22" + j, cnt);
            }catch (Exception e){
                System.out.println(e.getStackTrace());
            }
        }
//        p2[ii][j++] = new Person(name, id, age);
//        if (j > 3) {
//            ii++;
//            j = 0;
//        }
    }

    public static void print() {
        // for (Person[] pp : p2) {
        int o = 0;
        for (Person person : p) {
            try {
                System.out.println(person.toString());

            } catch (NullPointerException e) {
                System.out.println("place " + o + " is empty");
            } finally {
                o++;
            }
        }
        // }
    }
}
