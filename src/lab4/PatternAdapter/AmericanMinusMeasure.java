package lab4.PatternAdapter;

import java.util.Random;

public class AmericanMinusMeasure implements AmericanMeasure{
    Random random = new Random();
    @Override
    public double getFahrenheitTemperature() {
        return (temperature ) * 0.9;
    }

    @Override
    public double getWeightInPounds() {
        return (weight) * 0.9;
    }

    @Override
    public double getSizeInFeet() {
        return (size ) * 0.9;
    }
}
