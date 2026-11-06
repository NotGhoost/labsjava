import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void run(Input input) throws IOException {
        Path path = Paths.get("data", "task4", "speeds.txt");
        List<Double> speeds = new ArrayList<>();
        for (int i = 0; i < 15; i++) speeds.add(input.readDouble("Скорость " + (i + 1) + "/15: "));
        FileNumbers.write(path, speeds);
        speeds = FileNumbers.readDoubles(path);
        double average = speeds.stream().mapToDouble(Double::doubleValue).average().orElseThrow(
                () -> new IllegalStateException("Файл не содержит значений"));
        System.out.println("Скорости из файла " + path + ": " + speeds);
        System.out.printf("Средняя скорость: %.2f%n", average);
    }
}
