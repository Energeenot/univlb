package lab12.patternBuilder;


public class Director {
    public void constructorSportCar(Builder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Классический двигатель");
        builder.setGPS(true);
        builder.setTypeForWhat("Спорт");
    }
}
