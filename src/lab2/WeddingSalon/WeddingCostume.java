package lab2.WeddingSalon;

public class WeddingCostume extends Beverage{
    public WeddingCostume(){
        description = "Very good Wedding Costume, you look good in it!";
    }
    @Override
    public double cost() {
        return 40.5;
    }
}
