import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        try {
            while (true) {
                System.out.println("\nЛР 14, вариант 18. Выберите задание 1–5; 0 — выход.");
                int choice = input.readInt("Ваш выбор: ");
                if (choice == 0) break;
                try {
                    switch (choice) {
                        case 1: Task1.run(); break;
                        case 2: Task2.run(input); break;
                        case 3: Task3.run(); break;
                        case 4: Task4.run(input); break;
                        case 5: Task5.run(); break;
                        default: System.out.println("Нет такого задания.");
                    }
                } catch (IOException e) {
                    System.out.println("Ошибка работы с файлом: " + e.getMessage());
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("\nВвод завершён.");
        }
    }
}
