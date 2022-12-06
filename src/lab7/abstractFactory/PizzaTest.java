package lab7.abstractFactory;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore NYPizzaStore = new NYPizzaStore(); //переменные с малленькой
        PizzaStore ChicagoStore = new ChicagoPizzaStore();

        Pizza pizza = NYPizzaStore.orderPizza("cheese");
        System.out.println("Etan order a " + pizza + "\n");
//        thin dough

        pizza = ChicagoStore.orderPizza("cheese");
        System.out.println("Joel order a " + pizza + "\n");
//        thick dough

        pizza = NYPizzaStore.orderPizza("veggie");
        System.out.println("Etan order a " + pizza + "\n");

        pizza = ChicagoStore.orderPizza("veggie");
        System.out.println("Joel order a " + pizza + "\n");
    }
}
