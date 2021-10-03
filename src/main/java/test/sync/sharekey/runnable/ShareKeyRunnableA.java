package test.sync.sharekey.runnable;

public class ShareKeyRunnableA implements Runnable {

    @Override
    public void run() {
        tryShareKey();
    }

    private void tryShareKey() {
        while (true) {
            synchronized (this) {
                try {
                    System.out.print(String.format("%s first - ", Thread.currentThread().getName()));
                    Thread.sleep(1000);
                    System.out.println(String.format("%s second.", Thread.currentThread().getName()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
