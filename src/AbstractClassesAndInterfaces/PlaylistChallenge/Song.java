package AbstractClassesAndInterfaces.PlaylistChallenge;

public class Song {
    private String name;
    private int duration;

    public Song(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public static Song songBuilder(String name, int duration) {
        return new Song(name, duration);
    }

    @Override
    public String toString() {
        return "Name: " + this.name;
    }
}
