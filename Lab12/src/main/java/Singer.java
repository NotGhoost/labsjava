import java.util.ArrayList;
import java.util.List;

public class Singer {
    private final int id;
    private final String name;
    private final String genre;
    private int popularity;
    private final List<Integer> albumRatings;

    public Singer(int id, String name, String genre, int popularity, List<Integer> albumRatings) {
        if (albumRatings == null || albumRatings.isEmpty()) {
            throw new IllegalArgumentException("Список оценок не должен быть пустым");
        }
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.popularity = popularity;
        this.albumRatings = new ArrayList<>(albumRatings);
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public int getPopularity() { return popularity; }
    public void setPopularity(int popularity) { this.popularity = popularity; }
    public double getAverageAlbumRating() {
        return albumRatings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
    @Override
    public String toString() {
        return String.format("ID=%d, имя=%s, жанр=%s, популярность=%d, оценки=%s, средний рейтинг=%.2f",
                id, name, genre, popularity, albumRatings, getAverageAlbumRating());
    }
}
