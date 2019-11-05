package afeka.Q1;

public class Main {
    public static void main(String[] args){
     Store st = new Store();
     FreshAquarium f = new FreshAquarium(20,"mm",22,100,100);
     SaltAquarium s = new SaltAquarium(20,"salted",88,1998,'b');
     st.menu();
     st.addAquarium(s);
     st.printBestAquarium('a');
    }
}
