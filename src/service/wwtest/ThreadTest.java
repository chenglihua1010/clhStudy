package service.wwtest;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Created by wangwu on 2020/6/15.
 */
public class ThreadTest extends Thread{
    private String suo="suo";
    private Object object=new Object();
    private Integer integer=new Integer(1);



    public static void main(String[] args) {
    Thread thread1=new Thread();
        thread1.run();
        thread1.start();
        thread1.notify();
        thread1.notifyAll();

     Runnable runnable=new Runnable() {
         @Override
         public void run() {
             System.out.println("我是重新启动的某一个线程的输入方法");
         }
     };


    }

    //锁定整个方法,整个方法耗时10秒，在这10秒内，其他线程无法进入此方法
    public synchronized void abc(){
        System.out.println("abc");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
        System.out.println("aaa");
    }


    //锁定变量，当前只会锁定代码块内部的资源代码
    public void bnm(){


        System.out.println("other");
        System.out.println("other");
        System.out.println("other");
        System.out.println("other");
        System.out.println("other");
        System.out.println("other");
        System.out.println("other");
        System.out.println("other");


        synchronized(suo){
            System.out.println("bnm");
            System.out.println("bnm");
            System.out.println("bnm");
            System.out.println("bnm");
            System.out.println("bnm");
            System.out.println("bnm");
            System.out.println("bnm");
            System.out.println("bnm");
        }

    }

    //锁定某个对象，当前只会锁定代码块内部的资源代码
    public void kkk(){
        synchronized(object){
            System.out.println("kkk");
        }
    }

    //锁定自引用的对象，当前实例都被锁定，其他线程无法访问实例里面所有资源
    public void hhh(){
        synchronized(this){
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
            System.out.println("hhh");
        }
    }




    @Override
    public void run() {

    }


}
