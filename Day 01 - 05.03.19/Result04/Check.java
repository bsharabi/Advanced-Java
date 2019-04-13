package HomeWork.Result04;

public class Check {

    private String chNumber;
    private String bName;
    private int depNumber;
    private float amount;

    public Check(String chNumber, String bName, int depNumber, float amount) {
        this.chNumber = chNumber;
        this.bName = bName;
        this.depNumber = depNumber;
        this.amount = amount;
    }

    public Check() {
        this.chNumber = "NA";
        this.bName = "NA";
        this.depNumber = 0;
        this.amount = 0;
    }

    public String getChNumber() {
        return chNumber;
    }

    public String getbName() {
        return bName;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void Print() {
        System.out.println("The chNumber :"+chNumber + "\nBank Name :"+bName+"\ndepNumber :"+depNumber+"\namount :"+amount+"\n");
    }
}
