package lab7.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createdPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientsFactory();

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza.");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago style veggie pizza.");
        }else if (type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style clam pizza.");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago style pepperoni pizza.");
        }
        return pizza;
    }
}
