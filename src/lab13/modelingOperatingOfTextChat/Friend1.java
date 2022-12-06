package lab13.modelingOperatingOfTextChat;

public class Friend1 extends Friends{

    public Friend1(MediatorForTextChat mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение первому другу: " + message);
    }
}
