package lab2.withExtend;

public class DarkRoastSoyMochaCaramel extends DarkRoast {
    double cost = getCost() + 0.7d;
    public void all(){
        System.out.println(getName() + " + mocha + caramel " + cost + "$");
    }
}
