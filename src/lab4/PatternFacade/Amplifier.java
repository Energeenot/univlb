package lab4.PatternFacade;

public class Amplifier {
    public void on() {
        System.out.println("Усилитель включён");
    }

    public void setDvD() {
        System.out.println("Усилитель связан с DvD");
    }

    public void setSurround() {
        System.out.println("Включён режим окружающего звука");
    }

    public void setVolume(int i) {
        System.out.println("Установлена громкость " + i);
    }

    public void off() {
        System.out.println("Усилитель выключен");
    }
}
