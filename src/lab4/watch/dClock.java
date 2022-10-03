package lab4.watch;

import java.util.Random;

public interface dClock {
    Random random = new Random();
    int hours = random.nextInt(24);
    int minutes = random.nextInt(61);
    public void ptime();
}
