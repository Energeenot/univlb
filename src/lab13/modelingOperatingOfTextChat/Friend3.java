package lab13.modelingOperatingOfTextChat;

public class Friend3 extends Friends{
    public Friend3(MediatorForTextChat mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение третьему другу: " + message);
    }
}
