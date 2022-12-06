package lab12.patternBuilder;


public class CarBuilder implements Builder {
    private Car car;
    private String typeEngine;
    private int countOfSeats;
    private String GPS;
    private String typeForWhat;

    @Override
    public Builder reset() {
        car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int countOfSeats) {
        car.setCountOfSeats(countOfSeats);
        System.out.println("Сборка сидений классической модели");
        return this;
    }

    @Override
    public Builder setEngine(String typeEngine) {
        System.out.println("Сборка двигателя классической конструкции");
        car.setTypeEngine(typeEngine);
        return this;
    }

    @Override
    public Builder setGPS(boolean b) {
        if (b){
            System.out.println("Сборка gps классического режима");
            car.setGPS("Классический gps");
        }
        return this;
    }

    public Builder setTypeForWhat(String typeForWhat){
        System.out.println("Устанавливаем проставки, спойлер, меняем выхлопную...");
        car.setTypeForWhat(typeForWhat);
        return this;
    }
    public Car getResult(){
        return car;
    }
}
