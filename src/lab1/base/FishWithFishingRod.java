package lab1.base;

import lab1.base.FishBehavior;

public class FishWithFishingRod implements FishBehavior {
    int countOfFishCaught = random.nextInt(7);
    public void fish() {
        System.out.println("Поймал " + countOfFishCaught + " рыб");
    }
}
