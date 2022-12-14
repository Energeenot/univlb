package lab1.Pattern_Strategy;

public abstract class Fisherman {

    FishBehavior fishBehavior;

//    private String name;
//    private int countFishingRod;
//
//    lab1.base.Fisherman(String name, int countFishingRod){
//        this.name = name;
//        this.countFishingRod = countFishingRod;
//    }

    public Fisherman(){}

    public abstract void display();

    public void performFish(){
        fishBehavior.fish();
    }

    public void setFishBehavior(FishBehavior fishBehavior) {
        this.fishBehavior = fishBehavior;
    }
}
