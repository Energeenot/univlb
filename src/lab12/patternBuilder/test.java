package lab12.patternBuilder;


public class test {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructorSportCar(builder);
        System.out.println(builder.getResult());
        System.out.println();
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructorSportCar(manualBuilder);
    }
}
