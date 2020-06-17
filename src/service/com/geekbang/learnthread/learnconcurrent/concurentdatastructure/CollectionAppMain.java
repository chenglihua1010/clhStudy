package service.com.geekbang.learnthread.learnconcurrent.concurentdatastructure;

import java.util.concurrent.LinkedBlockingQueue;

public class CollectionAppMain {
        public static void main(String[] args) {
                //TODO 默认是Integer.MAX_VALUE这么大
                //TODO 元素不允许为null；
                LinkedBlockingQueue<String> linkedBlockingQueue=new LinkedBlockingQueue<>(128);

                // todo 获取队列最前面的，但是不出列
                linkedBlockingQueue.peek();

                //TODO 将元素放入队列，返回是否放入成功。一般在限制队列的大小情况下才会失败
                //todo 这个方法也有超时版本
                boolean addde=linkedBlockingQueue.offer("");

                //TODO 队列里有就拿出来，没有就返回空，还有超时重载版本
                linkedBlockingQueue.poll();

                try{
                        //TODO 将元素加入队列，如果队列满了，就等着
                        linkedBlockingQueue.put("");
                }catch(InterruptedException e){
                        e.printStackTrace();
                }

                //TODO 一定要拿到一个，否则就无限等待
                try{
                        linkedBlockingQueue.take();
                }catch(InterruptedException e){
                        e.printStackTrace();
                }
        }
}