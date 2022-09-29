package lab2.withExtend;

public class LargeDarkRoast extends DarkRoast {
    double cost = getCost() + 1.5d;
    public void all(){
        System.out.println("Large " + getName() + " + soy " + cost + "$");
    }
}
