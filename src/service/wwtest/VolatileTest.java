package service.wwtest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangwu on 2020/6/4.
 */
public class VolatileTest {
//        public  int inc=0;
        AtomicInteger inc=new AtomicInteger(0);
        public   void increase(){
                inc.getAndIncrement();
                System.out.println(inc+"+++"+Thread.currentThread());
        }

        public static void main(String[] args) {
                final VolatileTest volatileTest=new VolatileTest();
               int a=1;
                int b=2;
                int c=a++;
                int d=++a;
                System.out.println(a);
                System.out.println(c);
                System.out.println(a++);
                System.out.println(d);


        }
}
