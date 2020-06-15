package service.wwtest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by wangwu on 2020/6/15.
 */
public class LockTest extends Thread{
    private String suo="suo";
    private Object object=new Object();
    private Integer integer=new Integer(1);
    private Lock lock=new ReentrantLock();
    private ReentrantLock reentrantLock=new ReentrantLock();




    public static void main(String[] args) {


    }

    public void testLock(){
        lock.lock();
        lock.tryLock();
        reentrantLock.isLocked();
        reentrantLock.lock();
        try {
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");
            System.out.println("sfsdfsdf");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            lock.unlock();
        }



    }


}
