package HomeWorkB.Result04;

import HomeWorkB.Result01.Cat;
import HomeWorkB.Result02.SiameseCat;
import HomeWorkB.Result03.PersianCat;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Store {

    private ArrayList<Cat> cat;
    private FileWriter file;


    public Store() {
        cat = new ArrayList<Cat>();
    }

    public int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Pick your choice");
        System.out.println("[1] - Siamese Cat");
        System.out.println("[2] - Persian Cat ");
        System.out.println("[3] - exit");
        int in = input.nextInt();
        return in;

    }

    public void addAquarium(int num) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        switch (num) {

            case 1:
                int kg = (rnd.nextInt(20));
                String name = "" + (char) (rnd.nextInt(26) + 'A') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a');
                int number = (rnd.nextInt(1523) + 100000);
                int price = (rnd.nextInt(1000));
                char color = (char) (rnd.nextInt(3) + 'a');
                cat.add(new SiameseCat(kg, name, number, price, color));
                break;
            case 2:
                int kg1 = (rnd.nextInt(20));
                String name1 = "" + (char) (rnd.nextInt(26) + 'A') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a');
                int number1 = (rnd.nextInt(1523) + 100000);
                int price1 = (rnd.nextInt(1000));
                char color1 = (char) (rnd.nextInt(3) + 'a');
                cat.add(new PersianCat(kg1, name1, number1, price1));
                break;
            default:
                System.out.println("Sorry");
                break;

        }
    }

    public void deleteCat(String name) {

        for (int i = 0; i < cat.size(); i++) {
            if (cat.get(i).getNameCat().equals(name)) {
                cat.remove(i);
            }
        }

    }

    public void Sort(){cat.sort((x,y)->x.getPriceCat()-y.getPriceCat());}

    public void printBestCat(int rate) {



    }

    public void Print() {
        cat.forEach(x -> {
            System.out.println(x);
        });
    }
}
