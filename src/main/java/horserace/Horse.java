package horserace;

import java.util.concurrent.TimeUnit;

public class Horse extends Thread {

    private int range;
    private String msg = "";

    public Horse(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            randomEvent();
            range++;
//            msg += this.getName() + " run " + range + " m";
//            System.out.println(msg);
//            msg = "";
        }
    }

    private void randomEvent() {
        int eventCode = (int) (Math.random() * 10);
        switch (eventCode) {
            case 0:
                sprint();
                break;
            case 1:
                fall();
                break;
            default:
                range++;
        }
    }

    private void sprint() {
        msg += this.getName() + " sprint, ";
        range += 2;
    }

    private void fall() {
        msg += this.getName() + " fall, ";
    }

    public int getRange() {
        return this.range;
    }
}
