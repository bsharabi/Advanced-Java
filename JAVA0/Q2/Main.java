package Q2;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        // Obtain a number between [0 - 49].
        int n = rand.nextInt(20);
        Shop[] shops = new Shop[n];

        for (int i = 0; i < shops.length; i++) {
            shops[i] = new Shop(String.format("aa%d",i),rand.nextInt(30),rand.nextInt(10),rand.nextInt(20));
        }
        PrintCheapest(shops,rand.nextInt(40),rand.nextInt(10),rand.nextInt(3));
    }

    public static void PrintCheapest(Shop[] shops, int banana, int apple, int orange) {
        double[] prices = new double[shops.length];
        String name = "";
        double min,sum=0,avg;
        int i = 0;
        min = 99999999;
        for (Shop shop : shops) {
            prices[i] = apple * shop.getApple() + banana * shop.getBanana() + orange * shop.getOrange();
            sum += prices[i];
            System.out.println("Store Name: "+String.format(shop.getName()+" Price is: "+prices[i]));
            if (prices[i] < min) {
                min = prices[i];
                name = shop.getName();
            }
            i++;
        }
        avg = sum/shops.length;
        System.out.println(String.format("the Cheapest Store is: %s\nand the Price is: %f\nthe avg is: %f", name, min,avg));
    }
}
