package lab7.simpleFactory;

import java.util.Scanner;

public class PizzaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        for (int i = 0; i < 2; i++){
            System.out.println("Enter the name of the pizza what you wont to order");
            String typePizza = scanner.next();
            Pizza pizza = store.orderPizza(typePizza);
            System.out.println("We ordered a " + pizza.getName() + "\n" + pizza);
            System.out.println();
        }
    }
}
