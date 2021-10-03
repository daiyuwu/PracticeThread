package test.sync.deadlock;

public class LockTaskB extends Thread {

    public static Object key = new Object();

    @Override
    public void run() {
        synchronized(LockTaskB.key) {
            System.out.println("B get B.key");
            synchronized (LockTaskA.key) {
                System.out.println("B get A.key");
            }
            System.out.println("B release A.key");
        }
        System.out.println("B release B.key");
    }
}
