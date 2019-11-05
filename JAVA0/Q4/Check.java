package Q4;

public class Check {
    private String chNumber;
    private String bName;
    private int depNumber;
    private double amount;

    public Check(String chNumber, String bName, int depNumber, double amount) {
        this.chNumber = chNumber;
        this.bName = bName;
        this.depNumber = depNumber;
        this.amount = amount;
    }


    public Check() {
        this.chNumber = "";
        this.bName = "";
        this.depNumber = 0;
        this.amount = 0;
    }
    public void setData(String chNumber, String bName, int depNumber, double amount) {
        this.chNumber = chNumber;
        this.bName = bName;
        this.depNumber = depNumber;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "check num: "+chNumber+"\nbank name: "+bName+"\ndeparment: "+depNumber+"\n\n";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Check)
        {
           if(((Check) obj).bName.equals(bName) && ((Check) obj).amount == amount && ((Check) obj).chNumber.equals(chNumber) && ((Check) obj).depNumber == depNumber)
               return true;
        }
        return false;
    }
}
