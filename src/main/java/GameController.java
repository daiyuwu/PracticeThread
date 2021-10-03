import model.Game;

public class GameController {

    Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public void start() throws InterruptedException {
        this.game.start();

//        horse1.interrupt();
//        Thread.sleep(TimeUnit.SECONDS.sleep(3))
//        TimeUnit.SECONDS.sleep(3);
//        System.out.println("wake up !");
    }

}
