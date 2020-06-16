package service.com.geekbang.learnthread.deadlock;

import java.util.concurrent.TimeUnit;

public class Task2 implements Runnable{
        private AppResources appResources;

        public Task2(AppResources appResources){
                this.appResources=appResources;
        }

        @Override
        public void run() {
                //todo 申请资源顺序不同，可能会造成死锁
  //              differentSeq();

                //todo 申请资源顺序相同时，可以避免死锁，但是会降低资源的使用效率
                sameSeq();

        }

        private void sameSeq(){
                synchronized (appResources.getResourceInput()){
                        System.out.println("Task2得到了Input资源");
                        System.out.println("Task2开始工作");
                        try{
                                Thread.sleep(TimeUnit.SECONDS.toMillis(3));
                        }catch(InterruptedException e){
                                e.printStackTrace();
                        }
                        System.out.println("Task2尝试获取Printer资源");
                        synchronized(appResources.getResourcePrinter()){
                                System.out.println("Task2得到了Printer资源");
                                System.out.println("Task2继续工作");
                                try{
                                        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                                }catch (InterruptedException e){
                                        e.printStackTrace();
                                }
                        }
                }
        }

        private void differentSeq(){
                synchronized (appResources.getResourcePrinter()){
                        //TODO 先申请printer
                        System.out.println("Task2得到了Printer资源");
                        System.out.println("Task2开始工作");
                        try{
                                Thread.sleep(TimeUnit.MINUTES.toMillis(3));
                        }catch (InterruptedException e){
                                e.printStackTrace();
                        }
                        System.out.println("Task2尝试获取Input资源");
                        synchronized(appResources.getResourceInput()){
                                System.out.println("Tasks得到了Input资源");
                                System.out.println("Task2继续工作");
                                try{
                                        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                                }catch (InterruptedException e){
                                        e.printStackTrace();
                                }
                        }
                }
        }
}