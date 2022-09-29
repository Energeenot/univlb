package lab2.withExtend;

public class LargeDarkRoastSoy extends DarkRoast{
    double cost = getCost() + 1.7d;
    public void all(){
        System.out.println("Large "+ getName() + " + soy " + cost + "$");
    }
}
