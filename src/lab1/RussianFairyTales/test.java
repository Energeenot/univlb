package lab1.RussianFairyTales;

public class test {
    public static void main(String[] args) {
        FairyTales kolobok = new FairyTalesKolobok();
        kolobok.display();
        kolobok.performTell();
        System.out.println();
        FairyTales turnip = new FairyTalesTurnip();
        turnip.display();
        turnip.performTell();
    }
}
