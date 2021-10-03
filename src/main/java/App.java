import model.Game;
import test.pool.PoolGame;
import test.sync.deadlock.TestDeadLockGame;
import test.sync.sharekey.runnable.TestRunnableShareKeyGame;
import test.sync.sharekey.thread.TestThreadShareKeyGame;

public class App {

    public static void main(String[] args) throws InterruptedException {
//        Game game = new HorseRaceGame();
//        Game game = new TestDeadLockGame();
//        Game game = new TestThreadShareKeyGame();
        Game game = new TestRunnableShareKeyGame();
//        Game game = new PoolGame();
        GameController gameController = new GameController(game);
        gameController.start();
    }
}
