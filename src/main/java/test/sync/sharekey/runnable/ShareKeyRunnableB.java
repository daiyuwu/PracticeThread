package test.sync.sharekey.runnable;

public class ShareKeyRunnableB implements Runnable {

    @Override
    public void run() {
        tryShareKey();
    }

    private void tryShareKey() {
        synchronized(this) {
            try {
                System.out.println("BB.sleep 1s");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
