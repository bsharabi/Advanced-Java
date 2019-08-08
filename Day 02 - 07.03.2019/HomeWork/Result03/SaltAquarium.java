package HomeWork.Result03;
import HomeWork.Result01.Aquarium;


public class SaltAquarium extends Aquarium{

    private char saltRate;

    public SaltAquarium(int volume, String model, int year, int rate, char saltRate) {
        super(volume, model, year, rate);
        this.saltRate = saltRate;
    }

    public int getsaltRate() {
        return saltRate;
    }

    public void setsaltRate(char saltRate) {
        this.saltRate = saltRate;
    }

    @Override
    public String toString()
    {
        return "model: "+getName()+" rate: "+ getRating()+" year: "+getYear()+" volume: "+getVolume()+ " fresh rate: "+saltRate;

    }
    @Override
    public boolean equals(Object o)
    {
        if(o instanceof SaltAquarium)
        {
            SaltAquarium f = (SaltAquarium) o;
            if(f.getsaltRate() == saltRate)
            {
                return true;
            }
        }

        return false;
    }

}

