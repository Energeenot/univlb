package lab6DogDoor.myExample;

public class DogDoorSimulator {
    public static void main(String[] args){
        DogDoor dogDoor = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(dogDoor);
        Remote remote = new Remote(dogDoor);
        DogInspector dogInspector = new DogInspector(dogDoor);

        System.out.println("Fido starts barking.");
        recognizer.recognize("Woof");
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido`s all done...");

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}

        System.out.println("...but he`s stuck outside!");
        System.out.println("\nFido starts barking.");
        recognizer.recognize("Woof");
        System.out.println("\nFido`s back inside...");
    }
}
