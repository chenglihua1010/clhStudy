package service.com.geekbang.learnthread.learnconcurrent.learnlock.locksync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LearnLockAppMain {
        public static void main(String[] args) {
                Lock lock=new ReentrantLock();
                for(int i=0;i<3;i++){
                        Thread thread=new Thread(new WorkWithLock(lock),"Woker-"+i);
                        thread.start();
                }
        }
}