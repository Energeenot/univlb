package lab2.Pattern_Decorator;

public class Decaf extends Beverage {
    public Decaf(){
        description = "Coffee without caffeine";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
