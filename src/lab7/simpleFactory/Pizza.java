package lab7.simpleFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();


    public String getName() {
        return name;
    }

    public void Prepare(){
        System.out.println("Preparing " + name);
    }
    public void Bake(){
        System.out.println("Backing " + name);
    }
    public void Cut(){
        System.out.println("Cutting " + name);
    }
    public void Box(){
        System.out.println("Packing " + name);
    }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
