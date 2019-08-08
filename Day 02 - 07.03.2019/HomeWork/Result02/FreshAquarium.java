package HomeWork.Result02;

import HomeWork.Result01.Aquarium;

public class FreshAquarium extends Aquarium {

    private int LevelSweetness;

    public FreshAquarium(int volume, String name, int year, int rating, int levelSweetness) {
        super(volume, name, year, rating);
        LevelSweetness = levelSweetness;
    }

    public int getLevelSweetness() {
        return LevelSweetness;
    }

    public void setLevelSweetness(int levelSweetness) {
        LevelSweetness = levelSweetness;
    }

    @Override
    public String toString() {
        return "The Rating " + getRating() + " The Volume " + getVolume() + " The Name " + getName() + " The Year " + getYear() + " The LevelSweetness " + getLevelSweetness();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof FreshAquarium) {
            FreshAquarium f = (FreshAquarium) o;
            if (f.getLevelSweetness() == LevelSweetness) {
                return true;
            }
        }

        return false;
    }

}


