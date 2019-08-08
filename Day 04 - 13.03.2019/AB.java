package HomeWork;

public class AB extends Thread {
    private int minToSleep;

    public AB(int num)
    {
        this.minToSleep=num;
    }
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
