import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void run() throws IOException {
        Path f = Paths.get("data", "task3", "f.txt");
        Path g = Paths.get("data", "task3", "g.txt");
        Path h = Paths.get("data", "task3", "h.txt");
        Random random = new Random();
        List<Integer> generated = new ArrayList<>();
        for (int i = 0; i < 20; i++) generated.add(random.nextInt(201) - 100);
        FileNumbers.write(f, generated);
        List<Integer> divisible = new ArrayList<>();
        List<Integer> others = new ArrayList<>();
        for (int number : FileNumbers.readIntegers(f)) {
            if (number % 11 == 0) divisible.add(number);
            else others.add(number);
        }
        FileNumbers.write(g, divisible);
        FileNumbers.write(h, others);
        System.out.println("f: " + FileNumbers.readIntegers(f));
        System.out.println("g (кратные 11): " + FileNumbers.readIntegers(g));
        System.out.println("h (остальные): " + FileNumbers.readIntegers(h));
    }
}
