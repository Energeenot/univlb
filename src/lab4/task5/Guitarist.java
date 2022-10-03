package lab4.task5;

public class Guitarist extends Musician{
    private String name;

    public Guitarist(String name) {
        this.name = name;
    }

    public void playCoolOpening() {
        System.out.println(name + " начинает с крутого вступления");
    }

    public void playCoolRiffs() {
        System.out.println(name + " играет крутые риффы");
    }

    public void playAnotherCoolRiffs() {
        System.out.println(name + " играет другие крутые риффы");
    }

    public void playIncrediblyCoolSolo() {
        System.out.println(name + " выдает невероятно крутое соло");
    }

    public void playFinalAccord() {
        System.out.println(name + " заканчивает песню мощным аккордом");
    }
}
