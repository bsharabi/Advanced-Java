package afeka.Q1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private int choice;
    ArrayList<Aquarium> arr;
    Scanner scan = new Scanner(System.in);

    public Store() {
        arr = new ArrayList<Aquarium>();
    }

    public int menu() {

        System.out.println("MENU\nPick your choice:\n[1]-fresh water\n[2]-salt water\n[3]-exit");
        choice = scan.nextInt();
        return choice;
    }

    public void addAquarium(Aquarium aqa) {
        if (choice == 1 && aqa instanceof FreshAquarium) {
            arr.add(aqa);
        } else if (choice == 2 && aqa instanceof SaltAquarium) {
            arr.add(aqa);
        }
    }

    public void deleteAquarium(String name) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getModel().equals(name)) {
                arr.remove(i);
            }
        }
    }

    public void BubbleSort() {

        int n = arr.size();
        Aquarium temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr.get(j - 1).getVolume() > arr.get(j).getVolume()) {
                    //swap elements
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

    }

    void printBestAquarium(char rate) {
        StringBuilder str = new StringBuilder();
        for (Aquarium a : arr) {
            if (a instanceof SaltAquarium) {
                if (((SaltAquarium) a).getSaltnes() >= rate) {
                    str.append(a);
                    System.out.println("add 1 aqu to str");
                }
            }
        }
        if (str.length() > 0) {
            try (FileWriter f = new FileWriter("E:\\f.txt")) {

                f.write(str.toString());
            } catch (IOException e) {
                System.out.println(e);
            }
        }else{
            System.out.println(str.length());
        }
    }

}
