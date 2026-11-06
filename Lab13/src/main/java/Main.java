public class Main {
    public static void main(String[] args) {
        ShoeStore store = new ShoeStore();
        try {
            store.add(new Shoe("Nike", 42, "черный", 250.0, 5));
            store.add(new Shoe("Adidas", 38, "белый", 220.0, 3));
            System.out.println("Ассортимент магазина:");
            store.printStock();

            Shoe shoe = store.find("Nike", 42, "черный");
            shoe.sell(2);
            System.out.println("\nПродано 2 пары: " + shoe);
            shoe.restock(4);
            System.out.println("Пополнение на 4 пары: " + shoe);
        } catch (InvalidShoeDataException | ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Независимые проверки показывают обработку каждого вида исключения.
        try {
            new Shoe("Test", 19, "синий", 100, 1);
        } catch (InvalidShoeDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
        }
        try {
            store.find("Несуществующая марка", 40, "черный");
        } catch (ShoeNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        }
        try {
            store.find("Nike", 42, "черный").sell(100);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка продажи: " + e.getMessage());
        }
        try {
            store.find("Nike", 42, "черный").restock(-1);
        } catch (ShoeNotFoundException | StockException e) {
            System.out.println("Ошибка пополнения: " + e.getMessage());
        }
        System.out.println("\nИтоговые остатки:");
        store.printStock();
    }
}
