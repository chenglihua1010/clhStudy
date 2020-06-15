package service.com.geekbang.learnthread;

import service.com.geekbang.learnthread.ChangeData;
import service.com.geekbang.learnthread.DataHolder;

public class MuitiThreadChaos {
        public static void main(String[] args) {
                //TODO 同样的运算，安排在两个线程里做，结果就不一样了
                DataHolder dataHolder=new DataHolder();

                Thread increaseThread=new Thread(new ChangeData(-2,Integer.MAX_VALUE/50,dataHolder));

                Thread deceaseThread=new Thread(new ChangeData(2,Integer.MAX_VALUE/50,dataHolder));

                System.out.println("执行开始");
                increaseThread.start();
                deceaseThread.start();
        }
}