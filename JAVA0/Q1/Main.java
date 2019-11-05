package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String name;
        String city;
        int rooms;
        int free;
        Pp p = new Pp() {
            @Override
            String getName() {
                return "aaaa";
            }

            @Override
            void SetName(String n) {
                System.out.println(n);
            }
        };
        System.out.println(p.getName());
        p.SetName("MyName");
        System.out.println(p.getName());
//        Scanner scan = new Scanner(System.in);
//        Hotel[] HotelsAr = new Hotel[2];
//
//        for (int i = 0; i < HotelsAr.length; i++) {
//            HotelsAr[i] = new Hotel();
//            System.out.println("Please enter Hotel name: ");
//            name = scan.nextLine();
//
//            System.out.println("Please enter Hotel city: ");
//            city = scan.nextLine();
//
//            System.out.println("Please enter Hotel nums of rooms: ");
//            rooms = Integer.parseInt(scan.nextLine());
//
//            System.out.println("Please enter Hotel nums of free rooms: ");
//            free = Integer.parseInt(scan.nextLine());
//            HotelsAr[i].setData(name, city, rooms, free);
//        }
//        // search in the array for hotel in specific city
//        searchHotel(HotelsAr);
//
//        print40Percent(HotelsAr);
//
//        printAll(HotelsAr);

    }

    private static void printAll(Hotel[] hotelsAr) {
        for (Hotel i : hotelsAr) {
           System.out.println(i);
            System.out.println();
        }
    }

    // func to get hotel that print the free roms is more then 40%
    private static void print40Percent(Hotel[] HotelsAr) {
        System.out.println("\n\n---------------------------------------------------------\n\nHotels that have more then 40% free rooms:");
        for (Hotel i : HotelsAr) {
            if (i.getFree() > 0.4 * i.getRooms()) {
               System.out.println(i);
                System.out.println();
            }
        }
    }

    private static void searchHotel(Hotel[] HotelsAr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("in which city do you wish to search for hotel: ");
        String city = scan.nextLine();

        for (Hotel i : HotelsAr) {

            if (i.getCity().equals(city) && i.getFree() > 0) {
                System.out.println(i);
                
                System.out.println();
            }
        }
    }

}
