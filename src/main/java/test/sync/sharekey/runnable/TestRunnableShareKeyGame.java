package test.sync.sharekey.runnable;

import model.Game;

public class TestRunnableShareKeyGame implements Game {

    @Override
    public void start() {
        Runnable task = new ShareKeyRunnableA();

        Thread a = new Thread(task, "A");
        Thread b = new Thread(task, "B");

        a.start();
        b.start();
    }
}
