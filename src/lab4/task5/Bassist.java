package lab4.task5;

public class Bassist extends Musician{
    private String name;

    public Bassist(String name) {
        this.name = name;
    }

    public void followTheDrums() {
        System.out.println(name + " следует за барабанами");
    }

    public void changeRhythm(String type) {
        System.out.println(name + " перешел на ритм " + type + "a");
    }

    void stopPlaying() {
        System.out.println(name + " заканчивает играть");
    }
}
