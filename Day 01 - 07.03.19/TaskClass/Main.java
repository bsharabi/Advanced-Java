import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();
        ArrayList<Integer> grades = new ArrayList<>();
        int num = r.nextInt(20)+30;

        for(int i=0;i<num;i++)
            grades.add(r.nextInt(101));

        try (FileWriter file = new FileWriter("d:/grades.txt")){
            for(Integer i :grades)
                file.write(i+",");
            System.out.println(grades);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
