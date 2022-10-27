package lab4.PatternAdapter;

public class AmericanAdapter implements Measuring{
        AmericanMeasure americanMeasure;

        public AmericanAdapter(AmericanMeasure americanMeasure){
            this.americanMeasure = americanMeasure;
        }

        public double getTemperature() {
            return (americanMeasure.getFahrenheitTemperature() - 32  )/ 1.8;
        }
        //американ измер передаёт рандом значения а адаптер переводит из амер в метр

        public double getWeight() {
            return americanMeasure.getWeightInPounds() / 2.2;
        }

        public double getSize() {
            return americanMeasure.getSizeInFeet() * 0.0033;
        }
}