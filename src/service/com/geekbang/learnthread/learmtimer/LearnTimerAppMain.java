package service.com.geekbang.learnthread.learmtimer;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class LearnTimerAppMain {
        public static void main(String[] args) {
                Timer timer=new Timer();

                //todo 使用固定的频率schedule任务
                timer.scheduleAtFixedRate(new FindABCTask(),0, TimeUnit.SECONDS.toMillis(2));
        }
}