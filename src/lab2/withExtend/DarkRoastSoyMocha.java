package lab2.withExtend;

public class DarkRoastSoyMocha extends DarkRoast {
    double cost = getCost() + 0.6d;
    public void all(){
        System.out.println(getName() + " + soy + mocha " + cost + "$");
    }
}
