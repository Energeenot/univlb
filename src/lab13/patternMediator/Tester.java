package lab13.patternMediator;


public class Tester extends SoftwareDevelopmentTeam {
    public Tester(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение тестеру: " + message);
    }
}
