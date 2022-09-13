package lab1.Pattern_Strategy;

public class FishermanWithSpinning extends Fisherman {

    public FishermanWithSpinning(){
        fishBehavior = new FishWithSpinning();
    }

    @Override
    public void display() {
        System.out.println("Я рыбачу спиннингом");
    }
}
