package lab2.Decorator;

import lab2.Decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
