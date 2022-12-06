package lab13.patternMediator;


public abstract class SoftwareDevelopmentTeam {
    protected Mediator mediator;

    public SoftwareDevelopmentTeam(Mediator mediator){
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}
