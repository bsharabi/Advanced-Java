package afeka.Q1;

public class SaltAquarium extends Aquarium {
    private char saltnes;

    public SaltAquarium(int volume, String model, int review,int buildYear, char saltnes) {
        super(volume, model, review,buildYear);
        this.saltnes = saltnes;
    }

    public char getSaltnes() {
        return saltnes;
    }

    public void setSaltnes(char saltnes) {
        this.saltnes = saltnes;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSaltnes Level: "+saltnes;
    }
    @Override
    public boolean equals(Object obj){
        return ((SaltAquarium)obj).saltnes == saltnes && ((SaltAquarium)obj).getVolume() == this.getVolume();
    }
}
