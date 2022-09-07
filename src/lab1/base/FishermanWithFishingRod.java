package lab1.base;

public class FishermanWithFishingRod extends Fisherman {

    public FishermanWithFishingRod(){
        fishBehavior = new FishWithFishingRod();
    }

    @Override
    public void display() {
        System.out.println("Я рыбачу удочкой");
    }
}
