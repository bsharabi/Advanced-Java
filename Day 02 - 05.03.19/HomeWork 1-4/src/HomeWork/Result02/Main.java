package HomeWork.Result02;
import static java.lang.System.out;
import static java.lang.System.setOut;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void cheapest(Shop[] myshop, int banana, int apple, int orange) {
        int sum = 0, max = 0, min = 0, indexMin = 0, indexMax = 0;
        String nameMax, nameMin;
        for (Shop shop : myshop)
            shop.Print();
        for (int i = 0; i < myshop.length; i++) {
            sum += myshop[i].getApple();
            sum += myshop[i].getBanana();
            sum += myshop[i].getOrange();
            if (sum > max) {
                indexMax = i;
                max = sum;
                nameMax = myshop[i].getName();
            } else if (sum < min) {
                indexMin = i;
                min = sum;
                nameMin = myshop[i].getName();
            }

        }
        out.println("----- The most expensive -----");
        myshop[indexMax].Print();
        out.println("----- The cheapest -----");
        ;
        myshop[indexMin].Print();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        Shop[] myshop = new Shop[5];
        for (int i = 0; i < myshop.length; i++) {
            out.println("What is name of your store?");
            String name = in.nextLine();
//            float banana = in.nextFloat();
//            float apple = in.nextFloat();
//            float orange = in.nextFloat();
            out.println("how much does a banana coat");
            float banana = rand.nextFloat() + rand.nextInt(10);
            out.println("how much does a apple coat");
            float apple = rand.nextFloat() + rand.nextInt(10);
            out.println("how much does a orange coat");
            float orange = rand.nextFloat() + rand.nextInt(10);
            myshop[i] = new Shop(name, banana, apple, orange);
        }
        while (true) {
            out.println("Hello my dear friend,\nPlease insert how many fruit are you want");
            out.println("of banna :");
            int banana = in.nextInt();
            out.println("of apple :");
            int apple = in.nextInt();
            out.println("of orange :");
            int orange = in.nextInt();
            cheapest(myshop, banana, apple, orange);
            out.println("\nDo you want to try again yes or no?\n");
            int sn = in.nextInt();
            if (sn == 0)
                break;
        }
    }

}

