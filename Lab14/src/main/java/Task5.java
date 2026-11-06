import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void run() throws IOException {
        Path f = Paths.get("data", "task5", "f.txt");
        FileNumbers.write(f, Arrays.asList(8, 16, 23, 0, -8, 42, 64, 7, 80, 11));
        List<Integer> values = FileNumbers.readIntegers(f);
        System.out.println("Числа из файла " + f + ": " + values);
        System.out.println("Количество кратных 8: " + values.stream().filter(n -> n % 8 == 0).count());
    }
}
