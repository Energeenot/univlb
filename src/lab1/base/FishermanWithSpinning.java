package lab1.base;

public class FishermanWithSpinning extends Fisherman {

    public FishermanWithSpinning(){
        fishBehavior = new FishWithSpinning();
    }

    @Override
    public void display() {
        System.out.println("Я рыбачу спиннингом");
    }
}
