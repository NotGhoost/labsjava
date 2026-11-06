import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileNumbers {
    public static void write(Path path, List<? extends Number> numbers) throws IOException {
        List<String> lines = new ArrayList<>();
        for (Number number : numbers) lines.add(number.toString());
        Files.createDirectories(path.getParent());
        Files.write(path, lines, StandardCharsets.UTF_8);
    }
    public static List<Integer> readIntegers(Path path) throws IOException {
        List<Integer> values = new ArrayList<>();
        for (String line : Files.readAllLines(path, StandardCharsets.UTF_8)) {
            if (!line.trim().isEmpty()) values.add(Integer.parseInt(line.trim()));
        }
        return values;
    }
    public static List<Double> readDoubles(Path path) throws IOException {
        List<Double> values = new ArrayList<>();
        for (String line : Files.readAllLines(path, StandardCharsets.UTF_8)) {
            if (!line.trim().isEmpty()) values.add(Double.parseDouble(line.trim()));
        }
        return values;
    }
}
