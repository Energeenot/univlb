package lab4.watch;

public class AnalogWatch implements Watch {
    @Override
    public void time() {
//        int minutes = angle * 2;
//        int hours = 0;
//        while (minutes >= 60){
//            hours++;
//            minutes -= 60;
//        }
        System.out.println("аналоговые часы показывают:");
//        System.out.println("time is " + hours +":" + minutes);
        System.out.println("      12    ");
        System.out.println("   11     1  ");
        System.out.println(" 10     /   2 ");
        System.out.println("9      . _ _  3");
        System.out.println("  8         4 ");
        System.out.println("    7     5  ");
        System.out.println("       6      ");
        System.out.println("при угле = " + angle);
    }
}
