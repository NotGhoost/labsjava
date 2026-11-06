import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void run(Input input) throws IOException {
        Path f = Paths.get("data", "task2", "f.txt");
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < 10; i++) values.add(input.readInt("Целое число " + (i + 1) + "/10: "));
        FileNumbers.write(f, values);
        values = FileNumbers.readIntegers(f);
        System.out.println("Числа из файла " + f + ": " + values);
        long count = values.stream().filter(Task2::isPalindrome).count();
        System.out.println("Количество палиндромов: " + count);
    }
    public static boolean isPalindrome(int number) {
        // Отрицательные числа не считаются палиндромами из-за знака минус.
        if (number < 0) return false;
        String s = Integer.toString(number);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
