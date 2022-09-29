package lab2.withExtend;

public class LargeDarkRoastCaramelMocha extends DarkRoast {
    double cost = getCost() + 2.9d;
    public void all(){
        System.out.println("Large "+ getName() + " + caramel + mocha " + cost + "$");
    }
}
