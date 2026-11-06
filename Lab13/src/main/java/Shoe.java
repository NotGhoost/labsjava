public class Shoe {
    private final String brand;
    private final int size;
    private final String color;
    private final double price;
    private int stock;

    public Shoe(String brand, int size, String color, double price, int stock)
            throws InvalidShoeDataException {
        if (brand == null || brand.trim().isEmpty() || color == null || color.trim().isEmpty()) {
            throw new InvalidShoeDataException("Марка и цвет не должны быть пустыми");
        }
        if (size < 20 || size > 50) {
            throw new InvalidShoeDataException("Размер должен быть от 20 до 50 включительно");
        }
        if (!Double.isFinite(price) || price <= 0) {
            throw new InvalidShoeDataException("Цена должна быть конечным положительным числом");
        }
        if (stock < 0) throw new InvalidShoeDataException("Остаток не может быть отрицательным");
        this.brand = brand;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stock = stock;
    }
    public String getBrand() { return brand; }
    public int getSize() { return size; }
    public String getColor() { return color; }
    public int getStock() { return stock; }

    public void sell(int quantity) throws StockException {
        if (quantity <= 0) throw new StockException("Количество для продажи должно быть больше нуля");
        if (quantity > stock) throw new StockException("Недостаточно пар на складе: доступно " + stock);
        stock -= quantity;
    }
    public void restock(int quantity) throws StockException {
        if (quantity <= 0) throw new StockException("Количество для пополнения должно быть больше нуля");
        if (quantity > Integer.MAX_VALUE - stock) throw new StockException("Слишком большой остаток");
        stock += quantity;
    }
    @Override
    public String toString() {
        return String.format("%s, размер %d, цвет %s, цена %.2f, в наличии %d пар",
                brand, size, color, price, stock);
    }
}
