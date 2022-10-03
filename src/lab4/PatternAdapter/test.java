package lab4.PatternAdapter;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        PlusMeasure plusMeasure = new PlusMeasure();
        MinusMeasure minusMeasure = new MinusMeasure();
        ArrayList<Measuring> measurer = new ArrayList<>();
        measurer.add(plusMeasure);
        measurer.add(minusMeasure);
        AmericanPlusMeasure americanPlusMeasure = new AmericanPlusMeasure();
        Measuring plusAdapter = new AmericanAdapter(americanPlusMeasure);
        AmericanMinusMeasure americanMinusMeasure = new AmericanMinusMeasure();
        Measuring minusAdapter = new AmericanAdapter(americanMinusMeasure);
        double temperature;
        double weight;
        double size;
        double averageTemperature = 0;
        double averageWeight = 0;
        double averageSize = 0;
        double maxTemperature =  - 151;
        double maxWeight =  - 1002;
        double maxSize = 0;
        double minimumTemperature =  152;
        double minimumWeight = 1002;
        double minimumSize = 2;

        for (int i = 0; i < measurer.size(); i ++){
            Measuring measuring = (Measuring) measurer.get(i);
            for (int j = 0; j < 3; j++){
                temperature = measuring.getTemperature();
                weight = measuring.getWeight();
                size = measuring.getSize();
                System.out.println("weight = " + weight + ", temperature = " + temperature + ", size = " + size);
                averageWeight += weight;
                averageSize += size;
                averageTemperature += temperature;
                if (weight > maxWeight){
                    maxWeight = weight;
                }
                if (minimumWeight < weight){
                    minimumWeight = weight;
                }
                if (temperature > maxTemperature){
                    maxTemperature = temperature;
                }
                if (minimumTemperature < temperature){
                    minimumTemperature = temperature;
                }
                if (size > maxSize){
                    maxSize = size;
                }
                if (minimumSize < size){
                    minimumSize = size;
                }
            }
        }
        System.out.println("maxWeight = " + maxWeight);
        System.out.println("maxSize = " + maxSize);
        System.out.println("maxTemperature = " + maxTemperature);
        System.out.println("minimumWeight = " + minimumWeight);
        System.out.println("minimumSize = " + minimumSize);
        System.out.println("minimumTemperature = " + minimumTemperature);
        System.out.println("averageWeight = " + averageWeight / 3);
        System.out.println("averageSize = " + averageSize / 3);
        System.out.println("averageTemperature = " + averageTemperature / 3);
        measurer.add(plusAdapter);
        measurer.add(minusAdapter);
        for (int i = 0; i < measurer.size(); i ++){
            Measuring measuring = (Measuring) measurer.get(i);
            for (int j = 0; j < 3; j++){
                temperature = measuring.getTemperature();
                weight = measuring.getWeight();
                size = measuring.getSize();
                System.out.println("weight = " + weight + ", temperature = " + temperature + ", size = " + size);
                averageWeight += weight;
                averageSize += size;
                averageTemperature += temperature;
                if (weight > maxWeight){
                    maxWeight = weight;
                }
                if (minimumWeight < weight){
                    minimumWeight = weight;
                }
                if (temperature > maxTemperature){
                    maxTemperature = temperature;
                }
                if (minimumTemperature < temperature){
                    minimumTemperature = temperature;
                }
                if (size > maxSize){
                    maxSize = size;
                }
                if (minimumSize < size){
                    minimumSize = size;
                }
            }
        }


    }
}
