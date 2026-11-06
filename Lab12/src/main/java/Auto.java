public class Auto {
    private final String brand;
    private final int id;
    private final int horsepower;

    public Auto(String brand, int id, int horsepower) {
        this.brand = brand;
        this.id = id;
        this.horsepower = horsepower;
    }
    public String getBrand() { return brand; }
    @Override
    public String toString() {
        return "марка=" + brand + ", id=" + id + ", мощность=" + horsepower + " л.с.";
    }
}
