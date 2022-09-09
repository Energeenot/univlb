package lab2.WeddingSalon;

public class WeddingDress extends Beverage{
    public WeddingDress(){
        description = "It a good wedding dress, you look very cool in it!";
    }
    @Override
    public double cost() {
        return 50.9;
    }
}
