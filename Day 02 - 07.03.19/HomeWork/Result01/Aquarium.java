package HomeWork.Result01;

public abstract class Aquarium {

    private int volume;
    private String name;
    private int year;
    private int rating;


    public Aquarium(int volume, String name, int year, int rating) {
        this.volume = volume;
        this.name = name;
        this.year = year;
        this.rating = rating;
    }
    public Aquarium() {

    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isLonger(int x){
        if(volume>x)
            return true;
        return false;
    }
    @Override
    public String toString() {
        return "The Rating " + getRating() + " The Volume " + getVolume() + " The Name " + getName() + " The Year " + getYear() ;
    }

}
