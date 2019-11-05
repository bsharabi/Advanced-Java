package threads;

public class runable implements Runnable {
    private static int[] arr= new int[10];
    private int n;
    public runable(int n) {
       this.n = n;

    }
    public static void print(){
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    @Override
    public void run() {
        for(int i=n;i<n+3;i++){
            arr[i] = i;
        }
    }
}
