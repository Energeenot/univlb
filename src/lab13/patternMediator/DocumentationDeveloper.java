package lab13.patternMediator;

public class DocumentationDeveloper extends SoftwareDevelopmentTeam {

    public DocumentationDeveloper(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Сообщение разработчику документации " + message);
    }
}
