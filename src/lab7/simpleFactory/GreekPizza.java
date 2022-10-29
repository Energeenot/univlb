package lab7.simpleFactory;

public class GreekPizza extends Pizza{
    public GreekPizza(){
        name = "Greek Pizza";
        dough = "Crust";
        sauce = "Greek cream sauce";
        toppings.add("Sliced chicken");
        toppings.add("Sliced olives");
        toppings.add("Feta cheese");
    }
}
