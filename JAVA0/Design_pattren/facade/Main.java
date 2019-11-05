package Design_pattren.facade;

public class Main {
    public static void main(String[] args){

        HomeActionFacade haf = new HomeActionFacade();

        haf.sleepPreparation();

        haf.getOut();
    }
}
