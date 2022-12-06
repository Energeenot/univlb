package lab12.patternBuilder;

public interface Builder {
    public Builder reset();
    public Builder setSeats(int i);
    public Builder setEngine(String typeEngine);
    public Builder setGPS(boolean b);
    public Builder setTypeForWhat(String typeForWhat);
}
