import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Task1 {
    public static void run() throws IOException {
        Path path = Paths.get("data", "task1", "dream.txt");
        Files.createDirectories(path.getParent());
        // Пример мечты можно изменить в исходном коде перед запуском.
        String dream = "Моя мечта — путешествовать по миру, узнавать новые культуры и совершенствоваться в программировании.";
        Files.write(path, dream.getBytes(StandardCharsets.UTF_8));
        BasicFileAttributes info = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("Путь: " + path.toAbsolutePath());
        System.out.println("Размер: " + info.size() + " байт");
        System.out.println("Последнее изменение: " + info.lastModifiedTime());
        System.out.println("Содержимое: " + new String(Files.readAllBytes(path), StandardCharsets.UTF_8));
    }
}
