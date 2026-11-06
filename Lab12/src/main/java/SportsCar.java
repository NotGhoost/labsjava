public class SportsCar extends Auto {
    private final int topSpeed;
    public SportsCar(String brand, int id, int horsepower, int topSpeed) {
        super(brand, id, horsepower);
        this.topSpeed = topSpeed;
    }
    @Override
    public String toString() { return "SportsCar: " + super.toString() + ", максимальная скорость=" + topSpeed + " км/ч"; }
}
