package lab2.withExtend;

public class DarkRoastMocha extends DarkRoast {
    double cost = getCost() + 0.5d;
    public void all(){
        System.out.println(getName() + " + mocha " + cost + "$");
    }
}
