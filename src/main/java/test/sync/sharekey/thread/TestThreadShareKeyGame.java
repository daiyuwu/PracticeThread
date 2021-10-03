package test.sync.sharekey.thread;

import model.Game;

public class TestThreadShareKeyGame implements Game {

    @Override
    public void start() {
        Thread a = new ShareKeyThread("A");
        Thread b = new ShareKeyThread("B");

        a.start();
        b.start();
    }
}
