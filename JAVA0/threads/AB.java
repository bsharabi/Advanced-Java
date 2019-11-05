package threads;

public class AB extends Thread{

    private int timeToSleep;
    public AB(int sec){
        this.timeToSleep = sec*1000;
    }

    @Override
    public void run() {
        //super.run();
        try {
            sleep(200);
            System.out.println("after sleep " + timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println("in thread "+timeToSleep);
    }
}
