package lab13.dop;

public class Buyer extends People{
    public Buyer(Realtor realtor) {
        super(realtor);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение покупателю: " + message);
    }
}
