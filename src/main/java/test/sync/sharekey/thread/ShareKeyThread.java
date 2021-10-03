package test.sync.sharekey.thread;

public class ShareKeyThread extends Thread{

    public static Object key = new Object();

    public ShareKeyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            synchronized (ShareKeyThread.key) {
//            synchronized (this) {
                try {
                    System.out.print(String.format("%s first - ", this.getName()));
                    Thread.sleep(1000);
                    System.out.println(String.format("%s second.", this.getName()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
