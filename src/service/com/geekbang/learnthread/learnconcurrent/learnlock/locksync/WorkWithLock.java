package service.com.geekbang.learnthread.learnconcurrent.learnlock.locksync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WorkWithLock implements Runnable{

        //TODO ReentrantLock顾名思义，就是可以重复进入的锁，就是一个线程获得到锁之后，可以再一次的获取锁
        //TODO reentranceLock只是给它来个计数而已，而第一次没有获取锁的线程，则无法进入所
        //TODO 这个锁的操作是对标synchronized关键字的功能的
        private Lock lock;

        public WorkWithLock(Lock lock){
                this.lock=lock;
        }

        @Override
        public void run() {
                while(true){
                        //TODO 尝试获取锁，可以等待超时时间
                        //TODO TimeUnit是枚举的用法
                        try{
//                        try{
//                                lock.lock();

//                        }finally {
//                                lock.unlock();

//                        }
                        if(lock.tryLock(1, TimeUnit.SECONDS)){
                                try{
                                        printLockStatus("start");
                                        //TODO 必须用try—finally确保release锁
                                        process1();
                                }finally{
                                        lock.unlock();
                                        printLockStatus("finishde");
                                }
                        }else{
                                printLockFailure();
                                        }
                                }catch (InterruptedException e){
                                e.printStackTrace();
                        }
                }
        }


        private void process1(){
                try{
                        //TODO try第一行是lock
                        lock.lock();

                        printLockStatus("process1");

                        process2();
                }finally {
                        //TODO 一定要在finally里第一行unlock
                        lock.unlock();
                        printLockStatus("process1 finish");
                }
        }

        private void process2(){
                try{
                        lock.lock();

                        printLockStatus("process2");

                        process3();
                }finally {
                        lock.unlock();
                        printLockStatus("process2 finish");
                }
        }

        private void process3(){
                try{
                        lock.lock();

                        printLockStatus("process3");

                        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
                }catch (InterruptedException e){
                        e.printStackTrace();
                }finally{
                        lock.lock();
                        printLockStatus("process3 finish");

                }
        }

        private void printLockStatus(String phase){
                System.out.println("Thread:"+Thread.currentThread().getName()+""+phase
                                +"hold count="+((ReentrantLock)lock).getHoldCount());
        }

        private void printLockFailure(){
                System.out.println(Thread.currentThread().getName()+"failed to get lock");
        }


}