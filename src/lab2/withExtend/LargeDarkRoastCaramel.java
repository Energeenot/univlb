package lab2.withExtend;

public class LargeDarkRoastCaramel extends DarkRoast {
    double cost = getCost() + 1.9d;
    public void all(){
        System.out.println("Large " + getName() + " + caramel " + cost + "$");
    }
}
