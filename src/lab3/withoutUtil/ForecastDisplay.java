package lab3.withoutUtil;

public class ForecastDisplay implements Observer, DisplayElement{

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Прогноз");
        if (currentPressure > lastPressure){
            System.out.println("Ожидается улучшение погоды");
        } else if (currentPressure == lastPressure) {
            System.out.println("Погода не изменится");
        } else if (currentPressure < lastPressure) {
            System.out.println("Будет прохладно  и возможен дождь");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
