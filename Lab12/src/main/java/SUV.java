public class SUV extends Auto {
    private final int groundClearance;
    public SUV(String brand, int id, int horsepower, int groundClearance) {
        super(brand, id, horsepower);
        this.groundClearance = groundClearance;
    }
    @Override
    public String toString() { return "SUV: " + super.toString() + ", клиренс=" + groundClearance + " мм"; }
}
