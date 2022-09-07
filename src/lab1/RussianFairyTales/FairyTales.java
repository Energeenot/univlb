package lab1.RussianFairyTales;

public abstract class FairyTales {
    Storytelling storytelling;

    public FairyTales(){}
    public abstract void display();
    public void performTell(){
        storytelling.tell();}

}
