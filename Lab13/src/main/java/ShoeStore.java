import java.util.ArrayList;
import java.util.List;

public class ShoeStore {
    private final List<Shoe> shoes = new ArrayList<>();
    public void add(Shoe shoe) {
        if (shoe == null) throw new IllegalArgumentException("Обувь не может быть null");
        shoes.add(shoe);
    }
    public Shoe find(String brand, int size, String color) throws ShoeNotFoundException {
        for (Shoe shoe : shoes) {
            if (shoe.getBrand().equalsIgnoreCase(brand) && shoe.getSize() == size
                    && shoe.getColor().equalsIgnoreCase(color)) return shoe;
        }
        throw new ShoeNotFoundException("Обувь не найдена: " + brand + ", размер " + size + ", цвет " + color);
    }
    public void printStock() {
        for (Shoe shoe : shoes) System.out.println(shoe);
    }
}
