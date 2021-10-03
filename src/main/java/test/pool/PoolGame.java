package test.pool;

import model.Game;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolGame implements Game {

    @Override
    public void start() {
        ExecutorService service = Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++){
            service.execute(new MyExecutor(i));
            //service.submit(new MyExecutor(i));
        }
        System.out.println("submit finish");
        service.shutdown();
    }
}
