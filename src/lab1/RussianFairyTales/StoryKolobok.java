package lab1.RussianFairyTales;


public class StoryKolobok implements Storytelling {
    @Override
    public void tell() {
        System.out.print("Жили-были ");
        try {
            Thread.sleep(800);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("старик со старухой.");
        try {
            Thread.sleep(800);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Вот и просит старик:");
        try {
            Thread.sleep(800);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.print("Испеки мне, старая, ");
        try {
            Thread.sleep(700);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("колобок.");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        try {
            Thread.sleep(1500);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        System.out.println("А лиса его – гам! – и съела. ");
    }

    public StoryKolobok() {
    }
}
