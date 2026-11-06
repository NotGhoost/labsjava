public class VideoGame extends Game {
    private final String platform;

    public VideoGame(String name, String genre, double rating, String platform) {
        super(name, genre, rating);
        this.platform = platform;
    }

    @Override
    public String getDifficulty() { return "Сложная"; }

    public void startSession(String player) {
        System.out.println(player + " играет на платформе " + platform);
    }
    public void startSession(String player, int minutes) {
        System.out.println(player + " играет " + minutes + " мин. на платформе " + platform);
    }
}
