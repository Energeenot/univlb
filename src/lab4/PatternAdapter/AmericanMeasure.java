package lab4.PatternAdapter;

import java.util.Random;

public interface AmericanMeasure {

    Random random = new Random();
    double temperature = random.nextInt(151) - 50;
    double weight = random.nextInt(1001);
    double size = random.nextInt(2);

    public double getFahrenheitTemperature();
    public double getWeightInPounds();
    public double getSizeInFeet();
}
