package horserace;

import model.Game;

import java.util.Arrays;
import java.util.stream.Stream;

public class HorseRaceGame implements Game {

    @Override
    public void start() {

//        RaceTrack raceTrack = new RaceTrack(100);
        Horse[] horses = {
                new Horse("Alex"),
                new Horse("Jack")};

        Watcher watcher = new Watcher(horses);
        watcher.setDaemon(true);

        Arrays.stream(horses).forEach(h -> System.out.println("horse name: " + h.getName()));
        watcher.start();
        Arrays.stream(horses).forEach(h -> h.start());
    }
}
