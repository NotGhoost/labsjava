public class Sedan extends Auto {
    private final int trunkVolume;
    public Sedan(String brand, int id, int horsepower, int trunkVolume) {
        super(brand, id, horsepower);
        this.trunkVolume = trunkVolume;
    }
    @Override
    public String toString() { return "Sedan: " + super.toString() + ", багажник=" + trunkVolume + " л"; }
}
