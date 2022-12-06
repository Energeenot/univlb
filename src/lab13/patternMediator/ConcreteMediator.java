package lab13.patternMediator;

public class ConcreteMediator extends Mediator {
    public ProjectManager projectManager;
    public Developer developer;
    public Tester tester;
    public Customer customer;
    public DocumentationDeveloper documentationDeveloper;
    @Override
    public void send(String message, SoftwareDevelopmentTeam developmentTeam) {
        if (customer == developmentTeam) {
            projectManager.notify(message);
        } else if (projectManager == developmentTeam){
            developer.notify(message);
        } else if (developer == developmentTeam) {
            tester.notify(message);
        } else if (tester == developmentTeam) {
            documentationDeveloper.notify(message);
        } else if (documentationDeveloper == developmentTeam) {
            customer.notify(message);
        }

    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Tester getTester() {
        return tester;
    }

    public void setTester(Tester tester) {
        this.tester = tester;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DocumentationDeveloper getDocumentationDeveloper() {
        return documentationDeveloper;
    }

    public void setDocumentationDeveloper(DocumentationDeveloper documentationDeveloper) {
        this.documentationDeveloper = documentationDeveloper;
    }
}
