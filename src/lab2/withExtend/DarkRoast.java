package lab2.withExtend;

public class DarkRoast {
    private static String name = "DarkRoast";
    private static double cost = 1.5d;

    public static double getCost() {
        return cost;
    }

    public void all(){
        System.out.println(name +" " + cost + "$");
    }
    public static String getName(){
        return name;
    }
}
