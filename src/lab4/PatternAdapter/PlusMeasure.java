package lab4.PatternAdapter;

import java.util.Random;

public class PlusMeasure implements Measuring{

    @Override
    public double getTemperature() {
        return  temperature * 1.1;
//        return (random.nextInt(151) + -50) + ((random.nextInt(151) + -50) * 0.1);
    }

    @Override
    public double getWeight() {
        return weight * 1.1;
//        return (random.nextInt(1001) + (random.nextInt(1001)) * 0.1);
    }

    @Override
    public double getSize() {
        return size * 1.1;
//        return (random.nextInt(2) + random.nextInt(2) * 0.1);
    }
}
