package HomeWork.Result01;
import static java.lang.System.out;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);
        Hotel[] myHotel = new Hotel[2];
        for (int i = 0; i < myHotel.length; i++) {
            out.println("Please insert your hotel name");
            String name = SCAN.nextLine();
            out.println("Please insert your city name");
            String city = SCAN.nextLine();
            out.println("Please insert your amount rooms");
            int rooms = Integer.parseInt(SCAN.nextLine());
            out.println("Please insert your vacant amount rooms");
            int free = Integer.parseInt(SCAN.nextLine());
            myHotel[i] = new Hotel(name, city, rooms, free);
        }
        out.println("Please enter the name of the city you are looking for");
        String name = SCAN.nextLine();
        for (Hotel i : myHotel) {
            if(i.getCity().equals(name))
                i.Print();
        }
        out.println("---- All Hotel ----");
        for (Hotel i : myHotel) {
                i.Print();
        }
        out.println("---- Each hotel has 40% or more rooms available ----");
        for (Hotel i : myHotel) {
            if(0.4*i.getRooms()<i.getFree())
                i.Print();
            }
}
    }



