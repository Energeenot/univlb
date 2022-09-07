package lab1.RussianFairyTales;

public class StoryTurnip implements Storytelling {
    @Override
    public void tell() {
        System.out.print("Посадил дед репку ");
        try {
            Thread.sleep(800);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("выросла репка большая ");
        try {
            Thread.sleep(800);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("пребольшая.");
        try {
            Thread.sleep(800);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Стал дед репку из земли тащить");
        try {
            Thread.sleep(700);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("Тянет-потянет, ");
        try {
            Thread.sleep(700);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("вытянуть не может.");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        try {
            Thread.sleep(1500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Тянут-потянут – вытащили репку!");
    }
}
