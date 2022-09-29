package lab2.withExtend;

public class LargeDarkRoastMocha extends DarkRoastMocha{
    double cost = getCost() + 2.5d;
    public void all(){
        System.out.println("Large " + getName() + " + mocha " + cost + "$");
    }
}
