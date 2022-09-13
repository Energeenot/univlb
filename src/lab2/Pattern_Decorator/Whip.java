package lab2.Pattern_Decorator;

public class Whip extends CondimentDecorator {
//    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double cost = beverage.cost();
        double scale = Math.pow(10, 2);
        if (beverage.getSize() == Size.TALL){
            cost += 0.10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.20;
        }
        cost = Math.ceil(cost * scale) / scale;
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
