package test.sync.deadlock;

import model.Game;

public class TestDeadLockGame implements Game {

    @Override
    public void start() {
        Thread a = new LockTaskA();
        Thread b = new LockTaskB();

        a.start();
        b.start();
    }
}
