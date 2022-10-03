package lab4.watch;

import java.util.Random;

public interface Watch {
    Random random = new Random();
    int angle = random.nextInt(360);
    public void time();
}
