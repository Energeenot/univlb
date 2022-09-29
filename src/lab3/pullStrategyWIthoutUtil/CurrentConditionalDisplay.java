package lab3.pullStrategyWIthoutUtil;

public class CurrentConditionalDisplay implements Observer, DisplayElement{
    float temperature;
    float humidity;
    float pressure;
    private WeatherData weatherData;
    public CurrentConditionalDisplay(WeatherData weatherData){
        this.weatherData =weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
