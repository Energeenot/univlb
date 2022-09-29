package lab2.withExtend;

public class DarkRoastCaramel extends DarkRoast {
    DarkRoast darkRoast;

    double cost = getCost() + 0.2d;
    @Override
    public void all(){
        System.out.println(getName() + " + caramel " + cost +"$");
    }
}
