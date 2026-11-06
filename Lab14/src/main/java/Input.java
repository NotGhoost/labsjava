import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);
    public int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNext()) throw new NoSuchElementException("Ввод завершён");
            String token = scanner.next();
            try { return Integer.parseInt(token); }
            catch (NumberFormatException e) { System.out.println("Введите целое число."); }
        }
    }
    public double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNext()) throw new NoSuchElementException("Ввод завершён");
            String token = scanner.next().replace(',', '.');
            try {
                double value = Double.parseDouble(token);
                if (Double.isFinite(value)) return value;
            } catch (NumberFormatException e) { /* повторный ввод */ }
            System.out.println("Введите конечное вещественное число.");
        }
    }
}
