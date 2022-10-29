package lab7.simpleFactory;

public class CheesePizza extends Pizza {
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular crust";
        sauce = "Marinara pizza sauce";
        toppings.add("Fresh mozzarella");
        toppings.add("Parmesan");
    }
}
