package lab1.Pattern_Strategy;

public class FishermanWithFishingRod extends Fisherman {

    public FishermanWithFishingRod(){
        fishBehavior = new FishWithFishingRod();
    }

    @Override
    public void display() {
        System.out.println("Я рыбачу удочкой");
    }
}
