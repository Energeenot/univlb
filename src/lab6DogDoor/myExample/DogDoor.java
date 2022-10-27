package lab6DogDoor.myExample;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    boolean open;

    public void open(){
        System.out.println("The dog door opens.");
        open = true;

        try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

        boolean check = DogInspector.isDogInTheDoor();
        if (check) {
            DogInspector.checkDog();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Fido left the aisle.");
        }
        close();

//        final Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                if (dogInspector.isDogInTheDoor()){
//                    System.out.println("The inspector calls the owners.");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Fido left the aisle.");
//
//                }
//                close();
//                timer.cancel();
//            }
//        }, 5000);
    }

    public void close(){
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}
