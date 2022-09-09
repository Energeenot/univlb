package lab2.Decorator;

import lab2.Decorator.Beverage;
import lab2.Decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
//    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        double scale = Math.pow(10, 2); //переменная для округления, 2 знака после запятой
        if (beverage.getSize() == Size.TALL){
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        }
        cost = Math.ceil(cost * scale) / scale; //сам процесс округления
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
