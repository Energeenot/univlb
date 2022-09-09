package lab2.WeddingSalon;

public class Flowers extends ClothingDecorator{
    public Flowers(Beverage beverage){this.beverage = beverage;}
    @Override
    public double cost() {
        double scale = Math.pow(10, 2);
        return Math.ceil((10.8 + beverage.cost()) * scale) / scale;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", flowers";
    }
}
