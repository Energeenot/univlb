package lab1.base;

public class FishermanWhatCantFish extends Fisherman {

    public FishermanWhatCantFish(){
        fishBehavior = new FishNoWay();
    }

    @Override
    public void display() {
        System.out.println("Я не умею рыбачить");
    }
}
