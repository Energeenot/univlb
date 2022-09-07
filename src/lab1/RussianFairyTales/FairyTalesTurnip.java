package lab1.RussianFairyTales;

public class FairyTalesTurnip extends FairyTales {
    @Override
    public void display() {
        System.out.println("Сейчас я расскажу сказку репка");
    }

    public FairyTalesTurnip() {storytelling = new StoryTurnip(); }
}
