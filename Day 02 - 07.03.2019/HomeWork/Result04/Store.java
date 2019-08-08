package HomeWork.Result04;

import HomeWork.Result01.Aquarium;
import HomeWork.Result02.FreshAquarium;
import HomeWork.Result03.SaltAquarium;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Store {

    private ArrayList<Aquarium> myAquarium;
    private FileWriter file;


    public Store() {
        myAquarium = new ArrayList<Aquarium>();
    }

    public int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Pick your choice");
        System.out.println("[1] - fresh water");
        System.out.println("[2] - salt water");
        System.out.println("[3] - exit");
        int in = input.nextInt();
        return in;

    }

    public void addAquarium(int num) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        switch (num) {
            case 1:
                ;
                int v = (rnd.nextInt(122));
                String n = "" + (char) (rnd.nextInt(26) + 'A') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a');
                int y = (rnd.nextInt(122));
                int r = (rnd.nextInt(122));
                int l = (rnd.nextInt(122));
                myAquarium.add(new FreshAquarium(v, n, y, r, l));
                break;
            case 2:
                int v1 = (rnd.nextInt(122));
                String n1 = "" + (char) (rnd.nextInt(26) + 'A') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a') + "" + (char) (rnd.nextInt(26) + 'a');
                int y1 = (rnd.nextInt(122));
                int r1 = (rnd.nextInt(122));
                char c = (char) (rnd.nextInt(3) + 'a');
                myAquarium.add(new SaltAquarium(v1, n1, y1, r1, c));
                break;
            default:
                System.out.println("Sorry");
                break;

        }


    }

    public void deleteAquarium(String name) {
        for (int i = 0; i < myAquarium.size(); i++) {
            if (myAquarium.get(i).getName().equals(name)) {
                myAquarium.remove(i);
            }
        }

    }

    public void Sort() {
        myAquarium.sort((x, y) -> x.getVolume() - y.getVolume());
    }


    public void printBestAquarium(int rate) {


        try (FileWriter file = new FileWriter("grades.txt")) {
            myAquarium.forEach(x -> {
                if (x instanceof SaltAquarium)
                    if (x.isLonger(rate)) {
                        String b = x.toString();
                        try {
                            file.write(b + "\n");
                        } catch (IOException e) {
                        }
                    }
            });
        } catch (IOException e) {
            System.out.println("sorry");
        }
    }

    public void Print() {
        myAquarium.forEach(x -> {
            System.out.println(x);
        });
    }

    public int howmuchrate() {

        int count = 0;
        for (Aquarium i : myAquarium) {
            if (i instanceof SaltAquarium) {
                SaltAquarium s = (SaltAquarium) i;
                if (s.getsaltRate() != 'a')
                    count++;
            }

        }
        return count;
    }
}


