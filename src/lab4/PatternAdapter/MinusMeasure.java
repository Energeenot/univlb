package lab4.PatternAdapter;

import java.util.Random;

public class MinusMeasure implements Measuring{
    Random random = new Random();

    @Override
    public double getTemperature() {
        return  temperature * 0.9;
//        return (random.nextInt(151) + -50) - ((random.nextInt(151) + -50) * 0.1);
    }

    @Override
    public double getWeight() {
        if (weight * 0.9 < 0){
            return 0;
        }else return (weight * 0.9);
    }

    @Override
    public double getSize() {
        if (size * 0.9 < 0){
            return 0;
        } else return (size * 0.9);
    }
}
