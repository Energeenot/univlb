package lab7.abstractFactory;

public abstract class PizzaStore {
    protected abstract Pizza createdPizza(String type);

    public Pizza orderPizza(String type){
        Pizza pizza = createdPizza(type);
        System.out.println("---- Making a " + pizza.getName() + " ----");
        pizza.Prepare();
        pizza.Bake();
        pizza.Cut();
        pizza.Box();
        return pizza;
    }
}
