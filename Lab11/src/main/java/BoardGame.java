public class BoardGame extends Game {
    private final int maxPlayers;

    public BoardGame(String name, String genre, double rating, int maxPlayers) {
        super(name, genre, rating);
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String getDifficulty() { return "Легкая"; }

    // Собственные перегруженные методы наследника.
    public void organizeSession(int players) {
        System.out.println("Настольная игра: игроков " + players + " из " + maxPlayers);
    }
    public void organizeSession(int players, int minutes) {
        System.out.println("Игроков: " + players + ", время партии: " + minutes + " мин.");
    }
}
