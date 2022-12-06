package lab13.modelingOperatingOfTextChat;

public class Friend2 extends Friends{

    public Friend2(MediatorForTextChat mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение второму другу: " + message);
    }
}
