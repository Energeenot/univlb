package lab4.watch;


public class test {
    public static void main(String[] args) {
        System.out.println("Цифровые часы показывают:");
        DigitalClock digitalClock = new DigitalClock();
        digitalClock.ptime();
        System.out.print("Без адаптера ");
        AnalogWatch watch = new AnalogWatch();
        watch.time();
        dClock adapter = new digitalClockAdapter(watch);
        System.out.println("Аналоговые часы с адаптером показывают:");
        adapter.ptime();
    }
}
