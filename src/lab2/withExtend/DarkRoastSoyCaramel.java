package lab2.withExtend;

public class DarkRoastSoyCaramel extends DarkRoast {
    double cost = getCost() + 0.3d;
    public void all(){
        System.out.println(getName() + " + soy + caramel " + cost + "$");
    }
}
