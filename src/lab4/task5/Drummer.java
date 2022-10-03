package lab4.task5;

public class Drummer extends Musician{
    private String name;

    public Drummer(String name) {
        this.name = name;
    }

    public void startPlaying() {
        System.out.println(name + " начинает играть");
    }

    public void stopPlaying() {
        System.out.println(name + " заканчивает играть");
    }
}
