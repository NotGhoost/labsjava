import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1. Автомобили");
        Map<String, Auto> autos = new LinkedHashMap<>();
        Auto[] examples = {
            new Sedan("Toyota", 1, 150, 480), new Sedan("Honda", 2, 180, 420),
            new Sedan("Volkswagen", 3, 150, 510), new SUV("Jeep", 4, 270, 220),
            new SUV("Volvo", 5, 250, 210), new SUV("Subaru", 6, 170, 220),
            new SportsCar("Porsche", 7, 385, 293), new SportsCar("Ferrari", 8, 670, 340)
        };
        for (Auto auto : examples) autos.put(auto.getBrand(), auto);
        for (Map.Entry<String, Auto> entry : autos.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + "; значение: " + entry.getValue());
        }

        System.out.println("\nЗадание 2. Певцы");
        List<Singer> singers = new ArrayList<>(Arrays.asList(
            new Singer(1, "Анна", "Поп", 3, Arrays.asList(5, 4, 5)),
            new Singer(2, "Борис", "Рок", 2, Arrays.asList(2, 3, 1)),
            new Singer(3, "Виктор", "Джаз", 4, Arrays.asList(3, 4, 3)),
            new Singer(4, "Галина", "Поп", 2, Arrays.asList(5, 4, 5)),
            new Singer(5, "Алексей", "Рок", 3, Arrays.asList(4, 4, 4))
        ));
        System.out.println("Исходный список:");
        singers.forEach(System.out::println);
        singers.removeIf(singer -> singer.getAverageAlbumRating() < 3);
        for (Singer singer : singers) {
            if (singer.getAverageAlbumRating() >= 4) {
                singer.setPopularity(singer.getPopularity() + 1);
            }
        }
        System.out.println("\nПевцы с популярностью 3 после изменений:");
        printSingers(singers, 3);
        singers.sort(Comparator.comparingDouble(Singer::getAverageAlbumRating).reversed()
                .thenComparing(Singer::getName));
        System.out.println("\nОставшиеся певцы по убыванию среднего рейтинга:");
        for (Singer singer : singers) {
            System.out.printf("ID=%d, имя=%s, средний рейтинг=%.2f%n",
                    singer.getId(), singer.getName(), singer.getAverageAlbumRating());
        }
    }
    public static void printSingers(List<Singer> singers, int popularity) {
        for (Singer singer : singers) {
            if (singer.getPopularity() == popularity) System.out.println(singer);
        }
    }
}
