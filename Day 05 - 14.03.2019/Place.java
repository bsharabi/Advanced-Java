package ClassWork;

public class Place implements Runnable {

    private static Person[] myPerson=new Person[10];
    private static int place=0;

    
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            myPerson[place++]=new Person();
        }
    }

}
