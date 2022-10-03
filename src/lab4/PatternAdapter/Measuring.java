package lab4.PatternAdapter;

import java.util.Random;

public interface Measuring {
    Random random = new Random();
    double temperature = random.nextInt(151) - 50;
    double weight = random.nextInt(1001);
    double size = random.nextInt(2);
    public double getTemperature();
    public double getWeight();
    public double getSize();
}
