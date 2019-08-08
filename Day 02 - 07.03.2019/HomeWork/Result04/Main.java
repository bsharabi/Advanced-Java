package HomeWork.Result04;

public class Main {
    public static void cls()
    {
        try
        {
            new ProcessBuilder("cmd","/c","cls","clear").inheritIO().start().waitFor();
        }catch (Exception e){
            System.out.println(e);
        }
    }
	public static void main(String[] args) {

		Store myStore = new Store();
		boolean bol=true;
		int n;
		while(bol){
			n=myStore.menu();
			if(n==3)
				bol=false;
			else {
                cls();
                myStore.addAquarium(n);
            }
		}

		System.out.println("\n------------------------------\n");
		myStore.Print();
		System.out.println("\n------------------------------\n");
		myStore.deleteAquarium("Alice");
		myStore.Print();
		System.out.println("\n------------------------------\n");
		myStore.Sort();
		myStore.Print();
		System.out.println("\n------------------------------\n");
		myStore.printBestAquarium(3);
		System.out.println("\n------------------------------\n");
		System.out.println(myStore.howmuchrate());


	}
}

