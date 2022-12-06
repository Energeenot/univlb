package lab12.patternBuilder;


public class Car {
    private String typeEngine;
    private int countOfSeats;
    private String GPS;
    private String typeForWhat;

    public Car() {
        super();
    }

    public Car(String typeEngine, int countOfSeats, String GPS, String typeForWhat) {
        this.typeEngine = typeEngine;
        this.countOfSeats = countOfSeats;
        this.GPS = GPS;
        this.typeForWhat = typeForWhat;
    }


    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String gps) {
        this.GPS = gps;
    }

    public String getTypeForWhat() {
        return typeForWhat;
    }

    public void setTypeForWhat(String typeForWhat) {
        this.typeForWhat = typeForWhat;
    }

    @Override
    public String toString(){
        return "Car {" +
                "type engine: " + typeEngine +
                ", count of seats: " + countOfSeats +
                ", GPS: " + GPS +
                ", type for what: " + typeForWhat + "}";
    }
}