package afeka.Q1;

public class FreshAquarium extends Aquarium {
    private int sweetnes;

    public FreshAquarium(int volume, String model, int review,int buildYear, int sweetnes) {
        super(volume, model, review, buildYear);
        this.sweetnes = sweetnes;
    }

    public int getSweetnes() {
        return sweetnes;
    }

    public void setSweetnes(int sweetnes) {
        this.sweetnes = sweetnes;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSweetnes Level: "+sweetnes;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof FreshAquarium)
            return ((FreshAquarium)obj).getSweetnes() ==  sweetnes;
        return false;
    }
}
