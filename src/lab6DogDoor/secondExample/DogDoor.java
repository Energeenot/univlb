package lab6DogDoor.secondExample;

public class DogDoor {
    private boolean open;

    public void open(){
        System.out.println("The dog door open.");
        open = true;
    }

    public void close(){
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
