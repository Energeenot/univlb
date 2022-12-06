package lab12.patternBuilder;

public class CarManualBuilder implements Builder {
    public CarManualBuilder() {
        System.out.println("руководство пользователя");
    }
    @Override
    public Builder reset() {

        System.out.println("мы научим вас пользоваться машиной");
        return this;
    }

    @Override
    public Builder setSeats(int i) {
        System.out.println(i + " сиденья");
        return null;
    }

    @Override
    public Builder setEngine(String typeEngine) {
        System.out.println("в двигатель воду не лить , антифриз тоже, заливать только масло, и лучше вообще не трогайте если работает");
        return this;
    }

    @Override
    public Builder setGPS(boolean b) {
        System.out.println("GPS новейшей разработки, эта штука поможет вам двигаться по городу или куда вам там надо");
        return this;
    }

    @Override
    public Builder setTypeForWhat(String typeForWhat) {
        System.out.println("Это машина для спорт езды, только в столб не влетите");
        return this;
    }
}
