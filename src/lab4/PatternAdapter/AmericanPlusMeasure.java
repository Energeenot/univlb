package lab4.PatternAdapter;

import java.util.Random;

public class AmericanPlusMeasure implements AmericanMeasure{
    Random random = new Random();
    @Override
    public double getFahrenheitTemperature() {
        return (temperature) * 1.1;
    }

    @Override
    public double getWeightInPounds() {
        return (weight) * 1.1;
    }

    @Override
    public double getSizeInFeet() {
        return (size) * 1.1;
    }
}
