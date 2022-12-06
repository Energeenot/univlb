package lab13.modelingOperatingOfTextChat;

public class test {
    public static void main(String[] args) {
        MediatorForTextChat mediator = new MediatorForTextChat();
        Friends friend1 = new Friend1(mediator);
        Friends friend2 = new Friend2(mediator);
        Friends friend3 = new Friend3(mediator);
        mediator.setFriend1((Friend1) friend1);
        mediator.setFriend2((Friend2) friend2);
        mediator.setFriend3((Friend3) friend3);
        friend1.send("Привет, как у вас дела?");
        friend2.send("Привет, всё хорошо, как ты сам?");
        friend1.send("Всё отлично");
        friend3.send("Привет, у меня тоже всё хорошо");
    }
}
