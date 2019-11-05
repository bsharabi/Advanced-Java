package Q4;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Check[] checkArr = new Check[900];
        Check s = new Check(rnd.nextInt(2)+"",rnd.nextInt(3)+"",rnd.nextInt(2),rnd.nextInt(4));
        for(int i=0;i<checkArr.length;i++){
            checkArr[i] = new Check(rnd.nextInt(2)+"",rnd.nextInt(3)+"",rnd.nextInt(2),rnd.nextInt(4));
            System.out.println(checkArr[i]);
        }

        for(Check el : checkArr){
            if(el.equals(s))
                System.out.println("equal!!");
        }
    }

}
