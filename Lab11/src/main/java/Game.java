public class Game {
    private final String name;
    private final String genre;
    private final double rating;

    public Game(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public void play() { System.out.println("Играю"); }
    public void play(int level) { System.out.println("Играю на уровне " + level); }
    public void play(String mode) { System.out.println("Играю в режиме " + mode); }
    public void play (int a, int b) { System.out.println("чтото" );}
    public String getDifficulty() { return "Средняя"; }

    @Override
    public String toString() {
        return name + " (жанр: " + genre + ", рейтинг: " + rating + ")";
    }
}
