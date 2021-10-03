package horserace;

import java.util.Arrays;
import java.util.stream.Stream;

public class Watcher extends Thread {

    Horse[] horses;

    public Watcher(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printHorseRange();
        }
    }

    public void printHorseRange() {
//        System.out.println(String.format("horse1: %d, horse2: %d", horse1.getRange(), horse2.getRange()));
        Arrays.stream(horses)
                .forEach(h -> System.out.print(String.format("%s: %dm, ", h.getName(), h.getRange())));
        System.out.println();
    }
}
