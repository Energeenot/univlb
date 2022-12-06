package lab13.patternMediator;

public class Customer extends SoftwareDevelopmentTeam {
    public Customer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение заказчику: " + message);
    }


}
