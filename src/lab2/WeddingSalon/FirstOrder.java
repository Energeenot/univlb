package lab2.WeddingSalon;

public class FirstOrder {
    public static void main(String[] args) {
        Beverage beverage1 = new WeddingClothesForWitnesses();
        beverage1 = new Flowers(beverage1);
        System.out.println(beverage1.getDescription() + " $" +
                + beverage1.cost());
        Beverage beverage = new WeddingCostume();
        beverage = new Butterfly(beverage);
        beverage = new Flowers(beverage);
        System.out.println(beverage.getDescription() + " $" +
                + beverage.cost());
        Beverage beverage2 = new WeddingDress();
        beverage2 = new Flowers(beverage2);
        beverage2 = new Flowers(beverage2);
        beverage2 = new Hairpin(beverage2);
        System.out.println(beverage2.getDescription() + " $" +
                + beverage2.cost());

    }
}
