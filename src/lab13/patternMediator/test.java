package lab13.patternMediator;

public class test {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        SoftwareDevelopmentTeam customer = new Customer(concreteMediator);
        SoftwareDevelopmentTeam developer = new Developer(concreteMediator);
        SoftwareDevelopmentTeam projectManager = new ProjectManager(concreteMediator);
        SoftwareDevelopmentTeam tester = new Tester(concreteMediator);
        SoftwareDevelopmentTeam documentationDeveloper = new DocumentationDeveloper(concreteMediator);
        concreteMediator.customer = (Customer) customer;
//        concreteMediator.setCustomer((Customer) customer);
        concreteMediator.developer = (Developer) developer;
//        concreteMediator.setDeveloper((Developer) developer);
        concreteMediator.projectManager = (ProjectManager) projectManager;
//        concreteMediator.setProjectManager((ProjectManager) projectManager);
        concreteMediator.tester = (Tester) tester;
//        concreteMediator.setTester((Tester) tester);
        concreteMediator.documentationDeveloper = (DocumentationDeveloper) documentationDeveloper;
//        concreteMediator.setDocumentationDeveloper((DocumentationDeveloper) documentationDeveloper);
        customer.send("Есть идейка, надо выполнить за две недели");
        projectManager.send("Мы приняли заказ, иди делай, срок две недели");
        developer.send("Кто такие задачи ставит на такой маленький срок, я не спал, но сделал, иди тести");
        tester.send("Слишком много багов, но сроки поджимают, сделаем вид, что всё хорошо");
        documentationDeveloper.send("Программа готова и документация тоже");


    }
}
