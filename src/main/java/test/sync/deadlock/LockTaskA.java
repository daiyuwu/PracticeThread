package test.sync.deadlock;

public class LockTaskA extends Thread {

    public static Object key = new Object();

    @Override
    public void run() {
        synchronized(LockTaskA.key) {
            System.out.println("A get A.key");
            synchronized (LockTaskB.key) {
                System.out.println("A get B.key");
            }
            System.out.println("A release B.key");
        }
        System.out.println("A release A.key");
    }
}
