package lab13.dop;

public class Seller extends People{
    public Seller(Realtor realtor) {
        super(realtor);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение продавцу: " + message);
    }
}
