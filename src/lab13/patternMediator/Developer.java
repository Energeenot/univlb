package lab13.patternMediator;

public class Developer extends SoftwareDevelopmentTeam {
    public Developer(Mediator mediator) {
        super(mediator);
    }

//    public void send(String message){
//        mediator.send(message, this);
//    }

    public void notify(String message){
        System.out.println("Сообщение программисту: " + message);
    }
}
