package afeka.Q1;

public abstract class Aquarium {
    private int volume;
    private String model;
    private int review;
    private int buildYear;



    public Aquarium(int volume, String model, int review,int buildYear) {
        this.volume = volume;
        this.model = model;
        this.review = review;
        this.buildYear = buildYear;
    }
    public Aquarium(){

    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }
    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @Override
    public String toString() {
        return "Model "+model+"\nVolume: "+ volume+"\nBuild at year: "+buildYear+"\nRating: "+review;
    }

    public boolean isLonger(int x){
        if(volume > x)
            return true;
        return false;

    }
}
