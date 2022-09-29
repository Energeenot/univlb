package lab2.withExtend;

public class LargeDarkRoastSoyCaramel extends DarkRoast {
    double cost = getCost() + 2.1d;
    public void all(){
        System.out.println("Large " + getName() + " + soy + caramel " + cost + "$");
    }
}
