package lab1.Pattern_Strategy;

public class test {
    public static void main(String[] args) {
        Fisherman German = new FishermanWithSpinning();
        German.display();
        German.performFish();
        System.out.println("");
        Fisherman Boris = new FishermanWhatCantFish();
        Boris.display();
        Boris.performFish();
        System.out.println("");
        Fisherman Ivan = new FishermanWithFishingRod();
        Ivan.display();
        Ivan.performFish();

        Ivan.setFishBehavior(new FishWithSpinning());
        Ivan.performFish();
    }
}
