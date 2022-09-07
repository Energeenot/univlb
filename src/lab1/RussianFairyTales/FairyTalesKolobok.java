package lab1.RussianFairyTales;

public class FairyTalesKolobok extends FairyTales {

    public FairyTalesKolobok(){storytelling = new StoryKolobok();}
    @Override
    public void display() {
        System.out.println("Сейчас я расскажу сказку колобок");
    }
}
