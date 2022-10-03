package lab4.PatternFacade;

public class test {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvDPlayer dvd = new DvDPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amp, dvd, cd, projector, screen, lights, popper);
        homeTheatreFacade.watchMovie("Raiders of the Lost Ark");
        homeTheatreFacade.endMovie();
    }
}
