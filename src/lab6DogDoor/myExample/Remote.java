package lab6DogDoor.myExample;


public class Remote {
    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public void pressButton() throws InterruptedException {
        System.out.println("Pressing the remote control button...");
        if (dogDoor.isOpen()){
            dogDoor.close();
        }else dogDoor.open();
    }
}
