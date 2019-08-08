package HomeWork.Result04;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void Search(Check[] CheckArr, Check CheckPtr) {
        boolean flag=true;
        for (int i = 0; i < CheckArr.length; i++) {
           if(CheckArr[i]==CheckPtr)
           {
               CheckPtr.Print();
               flag=false;
               break;
           }
        }
        if(flag)
        {
            System.out.println("Check not exist");
        }
    }
    public static void main(String[] args) {
        int num = 15;
        Random rand = new Random();
        Check CheckPtr;
        String[] str = {"Bank Hapoalim", "leumi", "Otzar Ahaial", "Yahav", "Egod", "Mizrahi tfahot", "Migdal", "Peper", "Paypal", "Bit", "AL", "Tbag", "Jerusalem", "TL-Aviv", "Mizrahi"};
        Check[] CheckArr = new Check[num];
        for (int i = 0; i < CheckArr.length; i++) {
            String Str1 = (String.valueOf(rand.nextInt(195948156)));
            CheckArr[i] = new Check(Str1, str[i], rand.nextInt(19), rand.nextFloat() + rand.nextInt(19));
        }
        for (int i = 0; i < CheckArr.length; i++) {
            System.out.println(CheckArr[i]);
            CheckArr[i].Print();
        }
        System.out.println("-------------- Search -----------------");
       // CheckPtr = CheckArr[rand.nextInt(15)];
        CheckPtr = new Check();
        Search(CheckArr, CheckPtr);
    }

}