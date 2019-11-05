package Design_pattren.facade;



public class HomeActions {
    private static final HomeActions instance = new HomeActions();
    private HomeActions(){

    }

    public static HomeActions getInstance() {
        return instance;
    }

    public void doorLock(){
        System.out.println("door locked");
    }
    public void acHandler(boolean action){
        System.out.println("ac turned "+(action?"On":"Off"));
    }
    public void lightHandler(boolean action){
        System.out.println("light turned "+(action?"On":"Off"));

    }
    public void thoothBrush(){
        System.out.println( "thooth Brushed");
    }
    public void bagHandler(){
        System.out.println("bag is ready");
    }
}
