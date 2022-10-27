package lab6DogDoor.thirdExample;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        Remote remote = new Remote(dogDoor);
        System.out.println();
        remote.pressButton();
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido`s all done...");

        try {
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {}

        System.out.println("...but he`s stuck outside!");
        System.out.println("\nFido starts barking...");
        System.out.println("...so Gina grabs thee remote control.");
        remote.pressButton();
        System.out.println("\nFido back inside...");
    }
}
