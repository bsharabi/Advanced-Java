package HomeWorkB.Result04;

import HomeWorkB.Result01.Cat;

import java.util.List;

public class main {


    public static void main(String[] args) {
        Store myStore = new Store();
        List<String> f= new List<String>
        while (true) {
            int num = myStore.menu();
            if (num == 3)
                break;
            myStore.addAquarium(num);
        }

        System.out.println("===============================");
        myStore.Print();
        System.out.println("===============================");
        myStore.Sort();
        System.out.println("================Sort===============");
        myStore.Print();
        System.out.println("===============================");

    }
}
