package service.com.geekbang.learnthread.threadlocal;

import java.util.concurrent.TimeUnit;

public class DBQuery {
        public void query(){
                PerformanceTracker.startPhase();

                try{
                        Thread.sleep((int)(Math.random()* TimeUnit.SECONDS.toMillis(5)));
                }catch (InterruptedException e){
                        e.printStackTrace();
                }

                PerformanceTracker.endPhase("DQBury");
        }
}