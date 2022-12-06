package lab13.modelingOperatingOfTextChat;

import java.util.ArrayList;

public class MediatorForTextChat{
    ArrayList<Friends> friendsList = new ArrayList<>();
    public Friend1 friend1;
    public Friend2 friend2;
    public Friend3 friend3;

    public void send(String message, Friends friends) {
        for (int i = 0; i < friendsList.size(); i++) {
            if (friendsList.get(i) == friends) {
                System.out.println(i + 1 + "-й отправил сообщение: " + message);
                for (int j = 0; j < friendsList.size(); j++) {
                    if (i != j) {
                        friendsList.get(i).notify(message);
                    }
                }
            }
        }
    }

    public Friend1 getFriend1() {
        return friend1;
    }

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
        friendsList.add(friend1);
    }

    public Friend2 getFriend2() {
        return friend2;
    }

    public void setFriend2(Friend2 friend2) {
        friendsList.add(friend2);
        this.friend2 = friend2;
    }

    public Friend3 getFriend3() {
        return friend3;
    }

    public void setFriend3(Friend3 friend3) {
        friendsList.add(friend3);
        this.friend3 = friend3;
    }
}
