package lab13.dop;

public abstract class People {
    protected Realtor realtor;

    public People(Realtor realtor){
        this.realtor = realtor;
    }

    public void send(String message){
        realtor.send(message, this);
    }

    public abstract void notify(String message);
}
