package Design_pattren.facade;

public class HomeActionFacade {
    HomeActions ha = HomeActions.getInstance();
    public void sleepPreparation(){
        System.out.println();
        System.out.println("Call to sleep Preparation");
        System.out.println();

        ha.lightHandler(false);
        ha.thoothBrush();
        ha.bagHandler();
    }
    public void getOut(){
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Call to get out");
        System.out.println();

        ha.doorLock();
        ha.lightHandler(false);
        ha.acHandler(false);
        ha.bagHandler();
    }
}
