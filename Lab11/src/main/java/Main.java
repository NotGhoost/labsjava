public class Main {
    public static void main(String[] args) {
        Game game = new Game("Тетрис", "Головоломка", 4.5);
        BoardGame board = new BoardGame("Шахматы", "Настольная", 4.8, 2);
        VideoGame video = new VideoGame("Minecraft", "Песочница", 4.9, "PC");

        System.out.println("Статический полиморфизм: перегрузка play");
        for (Game item : new Game[] {game, board, video}) {
            System.out.println("\n" + item);
            item.play();
            item.play(3);
            item.play("командный");
        }
        board.organizeSession(2);
        board.organizeSession(2, 30);
        video.startSession("Алексей");
        video.startSession("Алексей", 45);

        System.out.println("\nДинамический полиморфизм: переопределение getDifficulty");
        Game[] games = {game, board, video};
        for (Game item : games) {
            System.out.println(item + ": сложность — " + item.getDifficulty());
        }
    }
}
