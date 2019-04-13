package HomeWorkB.Result02;

public class main {

    public static void main(String[] args) {
        SiameseCat cat1 = new SiameseCat(10, "barak", 15654521, 150, 'a');
        SiameseCat cat2 = new SiameseCat(10, "barak", 15654525, 150, 'a');


        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.toString());
    }
}
