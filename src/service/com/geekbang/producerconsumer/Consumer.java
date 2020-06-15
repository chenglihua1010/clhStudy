package service.com.geekbang.producerconsumer;

import java.util.Queue;

public class Consumer<T>{
        private Queue<T>tasks;

        public Consumer(Queue<T> tasks){
                this.tasks=tasks;
        }

        public T consumer() throws InterruptedException {
                synchronized(tasks){
                        while(tasks.size()==0){
                                System.out.println("消费者线程进入等待："+Thread.currentThread().getName());
                                //TODO wait方法释放monitor
                                tasks.wait();
                        }
                        T ret=tasks.poll();
                        //TODO 调用notify或者notifyAll的时候必须已经获得monitor，也就是在synchornized块中
                        tasks.notifyAll();
                        return ret;

                }
        }
}