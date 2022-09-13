package lab1.Pattern_Strategy;

public class FishWithFishingRod implements FishBehavior {
    int countOfFishCaught = random.nextInt(7);
    public void fish() {
        System.out.println("Поймал " + countOfFishCaught + " рыб");
    }
}
