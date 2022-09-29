package lab2.withExtend;

public class LargeDarkRoastSoyMocha extends DarkRoast {
    double cost = getCost() + 2.7d;
    public void all(){
        System.out.println("Large " + getName() + " + soy + mocha" + cost + "$");
    }
}
