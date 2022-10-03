package lab4.PatternFacade;

public class DvDPlayer {
    public void on() {
        System.out.println("DvD проигрыватель вкдючён");
    }

    public void play(String movie) {
        System.out.println("Начать проигрывание фильма с названием " + movie);
    }

    public void stop() {
        System.out.println("Остановить проигрывание фильма");
    }

    public void eject() {
        System.out.println("Диск вытащен");
    }

    public void off() {
        System.out.println("DvD проигрыватель выключен");
    }
}
