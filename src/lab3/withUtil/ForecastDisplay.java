package lab3.withUtil;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg){
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("Прогноз");
        if (currentPressure > lastPressure){
            System.out.println("Ожидается улучшение погоды");
        } else if (currentPressure == lastPressure) {
            System.out.println("Погода не изменится");
        } else if (currentPressure < lastPressure) {
            System.out.println("Будет прохладно  и возможен дождь");
        }
    }
}
