package lab2.Pattern_Decorator;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
