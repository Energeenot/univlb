package lab4.watch;

public class digitalClockAdapter implements dClock{
    Watch watch;

    public digitalClockAdapter(Watch watch){this.watch = watch;}
    @Override
    public void ptime(/*int hours, int minutes int angle*/) {
        int minutes = Watch.angle * 2;
        int hours = 0;
        while (minutes >= 60){
            hours++;
            minutes -= 60;
        }
        System.out.println("Время: " + hours + ":" + minutes);
//        int angle = hours * 30;
//        angle += minutes * 0.5;
//        if (hours > 12){
//            System.out.println("Сейчас вечер");
//            hours -= 12;
//        }
//        watch.time(angle);
    }
    //в адаптере переводы
}
