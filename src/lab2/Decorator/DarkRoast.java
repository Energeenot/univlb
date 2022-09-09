package lab2.Decorator;

import lab2.Decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
