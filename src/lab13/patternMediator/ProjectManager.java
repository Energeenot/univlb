package lab13.patternMediator;


public class ProjectManager extends SoftwareDevelopmentTeam {
    public ProjectManager(Mediator mediator) {
        super(mediator);
    }

//    public void send(String message){
//        mediator.send(message, this);
//    }

    public void notify(String message){
        System.out.println("Сообщение менеджеру проекта: " + message);
    }
}
