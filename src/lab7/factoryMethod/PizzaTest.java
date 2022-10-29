package lab7.factoryMethod;

import java.util.Scanner;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore NYStore= new NYPizzaStore();
        PizzaStore ChicagoStore = new ChicagoPizzaStore();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the pizza what you wont to order");
        String typePizza = scanner.next();
        Pizza pizza= NYStore.orderPizza(typePizza);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n" + pizza);
        System.out.println();

        System.out.println("Enter the name of the pizza what you wont to order");
        typePizza = scanner.next();
        Pizza secondPizza= ChicagoStore.orderPizza(typePizza);
        System.out.println("Joel ordered a " + secondPizza.getName() + "\n" + secondPizza);
        System.out.println();
    }
}
