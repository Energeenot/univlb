package lab2.withExtend;

public class DarkRoastSoy extends DarkRoast {
    double cost = getCost() + 0.1d;
    public void all(){
        System.out.println(getName() + " + soy " + cost + "$");
    }
}
