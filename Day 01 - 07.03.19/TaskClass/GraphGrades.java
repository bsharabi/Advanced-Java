import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GraphGrades {

    public static void main(String[] args) {
        String data="";
        double[]arr={0,0,0,0,0};
        try(BufferedReader reader = new BufferedReader(new FileReader("d:/grades.txt"))) {

            data=reader.readLine();
            String str[]=data.split(",");
            if(str.length>0)
                for(String s:str) {
                    double i = Double.parseDouble(s);
                    if (i>=90) arr[0]++;
                    if (i>=80 && i<90) arr[1]++;
                    if (i>=70 && i<80) arr[2]++;
                    if (i>=60 && i<70) arr[3]++;
                    if (i<60) arr[4]++;
                }
            StdDraw.text(0.5,0.9,"GRADES");
            StdDraw.text(0.20,arr[0]/200+0.35,((int)(arr[0]))+"");
            StdDraw.text(0.35,arr[1]/200+0.35,((int)(arr[1]))+"");
            StdDraw.text(0.50,arr[2]/200+0.35,((int)(arr[2]))+"");
            StdDraw.text(0.65,arr[3]/200+0.35,((int)(arr[3]))+"");
            StdDraw.text(0.80,arr[4]/200+0.35,((int)(arr[4]))+"");

            StdDraw.filledRectangle(0.2,0.3+arr[0]/400,0.015,arr[0]/400);
            StdDraw.filledRectangle(0.35,0.3+arr[1]/400,0.015,arr[1]/400);
            StdDraw.filledRectangle(0.5,0.3+arr[2]/400,0.015,arr[2]/400);
            StdDraw.filledRectangle(0.65,0.3+arr[3]/400,0.015,arr[3]/400);
            StdDraw.filledRectangle(0.8,0.3+arr[4]/400,0.015,arr[4]/400);

            StdDraw.text(0.20,0.25,"A");
            StdDraw.text(0.35,0.25,"B");
            StdDraw.text(0.50,0.25,"C");
            StdDraw.text(0.65,0.25,"D");
            StdDraw.text(0.80,0.25,"F");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
