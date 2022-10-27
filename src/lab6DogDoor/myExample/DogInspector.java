package lab6DogDoor.myExample;

public class DogInspector {
    static boolean dogInTheDoor = true;
    private DogDoor dogDoor;

    public DogInspector(DogDoor dogDoor){
        this.dogDoor = dogDoor;
    }

    public static void checkDog(){
        if (isDogInTheDoor()){
            System.out.println("Dog is in the doorway.");
        }
    }

    public static boolean isDogInTheDoor() {
        return dogInTheDoor;
    }

}
