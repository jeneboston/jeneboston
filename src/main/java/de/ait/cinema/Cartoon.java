package de.ait.cinema;

public class Cartoon extends Film{
    private String animationType;

    public Cartoon(String title, int duration,
                   int rating, String genre, String animationType) {
        super(title, duration, rating, genre);
        this.animationType = animationType;
    }

    public String getAnimationType() {
        return animationType;
    }
    void showTrailer(){
        System.out.println("Cartoon{" +
                "animationType='" + animationType + '\'' +
                '}');
    }

}
