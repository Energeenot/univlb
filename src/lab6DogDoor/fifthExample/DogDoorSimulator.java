package lab6DogDoor.fifthExample;


public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor dogDoor = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(dogDoor);
        Remote remote = new Remote(dogDoor);

        System.out.println("Fido starts barking.");
        recognizer.recognize("Woof");
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido`s all done...");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){}

        System.out.println("...but he`s stuck outside!");
        System.out.println("\nFido starts barking.");
        recognizer.recognize("Woof");
        System.out.println("\nFido`s back inside...");
    }
}
