package lab4.watch;


public class DigitalClock implements dClock{

    @Override
    public void ptime() {
//        int minutes = angle * 2;
//        int hours = 0;
//        while (minutes >= 60){
//            hours++;
//            minutes -= 60;
//        }
        System.out.println("Время: " +dClock.hours + ":" + dClock.minutes);
    }
}
