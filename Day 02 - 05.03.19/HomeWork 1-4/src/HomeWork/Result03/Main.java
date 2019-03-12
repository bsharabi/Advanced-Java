package HomeWork.Result03;

public class Main {

    public static void main(String[] args) {

        Item myItem = new Item(19856487,"Computer",(float)3.5);
        NewItem myNewItem = new NewItem(myItem,7);
        myItem.Print();
        System.out.println(myItem.Coat(1000));
        System.out.println("-------------NewItem------------------");
        System.out.println(myNewItem.Coat(1000));
        System.out.println("-------------NewItemCoat------------------");
        System.out.println(myNewItem.NewCoat(500));


    }

}
