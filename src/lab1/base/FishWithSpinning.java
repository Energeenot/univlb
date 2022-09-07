package lab1.base;


public class FishWithSpinning implements FishBehavior {
    public void fish() {
        System.out.println("Поймал " + random.nextInt(12) + " рыб");
    }
}
