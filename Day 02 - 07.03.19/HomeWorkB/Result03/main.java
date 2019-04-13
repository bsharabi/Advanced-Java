package HomeWorkB.Result03;

public class main {

    public static void main(String[] args) {
        PersianCat cat1 = new PersianCat(10, "barak", 15652231, 152);
        PersianCat cat2 = new PersianCat(10, "barak", 15654525, 150);


        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.toString());
    }
}
