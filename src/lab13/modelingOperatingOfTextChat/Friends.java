package lab13.modelingOperatingOfTextChat;

public abstract class Friends {
    protected MediatorForTextChat mediator;

    public Friends(MediatorForTextChat mediator){
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }
    public abstract void notify(String message);
}
