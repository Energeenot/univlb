package lab2.WeddingSalon;

public class Butterfly extends ClothingDecorator{
    public Butterfly(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double scale = Math.pow(10, 2);
        return Math.ceil(( 2.3 + beverage.cost()) * scale) / scale;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", butterfly";
    }
}
