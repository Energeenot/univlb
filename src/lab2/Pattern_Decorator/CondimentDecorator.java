package lab2.Pattern_Decorator;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
