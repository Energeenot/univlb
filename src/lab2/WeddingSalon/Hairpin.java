package lab2.WeddingSalon;

public class Hairpin extends ClothingDecorator{
    public Hairpin(Beverage beverage){this.beverage = beverage;}
    @Override
    public double cost() {
//        double cost = beverage.cost();
        double scale = Math.pow(10, 2);
//        cost = Math.ceil(cost * scale) / scale;
        return Math.ceil((5.05 + beverage.cost() )* scale) / scale;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", hairpin";
    }
}
