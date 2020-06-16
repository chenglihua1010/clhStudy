package service.com.geekbang.learnthread.join;

import java.util.ArrayList;
import java.util.List;

public class ThreadJoinBeforeStartAppMain {
        private static final List<String> CONTENTS=new ArrayList<>();

        private static long WORKING_DURATION=0;

        public static void main(String[] args) throws InterruptedException {
                long mainStart=System.currentTimeMillis();
                List<Thread> threads=new ArrayList<>();

                for(int i=0;i<10;i++){
                        Thread thread=new Thread(()->{
                                System.out.println(Thread.currentThread().getName()+"：开始抓取网页内容");
                                long start=System.currentTimeMillis();
                                String content=getContentFromWeb();
                                long threadWorkingDuration=System.currentTimeMillis()-start;
                                System.out.println(Thread.currentThread().getName()+"：抓取网页内容结束");
                                synchronized (CONTENTS){
                                        CONTENTS.add(content);
                                        WORKING_DURATION+=threadWorkingDuration;
                                }
                        },"线程"+i);
                        threads.add(thread);
                }
                System.out.println("-----主线程开始join------");
                new Thread(()->{
                        for(Thread thread:threads){
                                try{
                                        String name=thread.getName();
                                        System.out.println("-----主线程开始join"+name+"-----");
                                        thread.join();
                                        System.out.println("-----主线程join"+name+"结束-----");
                                }catch(InterruptedException e){
                                        e.printStackTrace();
                                }
                        }
                        System.out.println("-----主线程join结束，获取的内容为：-----");

                        CONTENTS.forEach(s->{
                                System.out.println(s.length()+":");
                                System.out.println(s);
                        });

                        long mainWorkingDuration=System.currentTimeMillis()-mainStart;
                        System.out.println("工作线程累计工作时间："+WORKING_DURATION);
                        System.out.println("主线程累计工作时间："+mainWorkingDuration);
                }).start();

                //TODO 如果在线程开始之前，主线程就开始join，会怎么样？
                Thread.sleep(100);

                threads.forEach(Thread::start);
        }

        private static String getContentFromWeb(){
                StringBuilder ret=new StringBuilder();
                int len=((int)(Math.random()*100000))%4096+1024;
                for(int i=0;i<len;i++){
                        int rand=((int)(Math.random()*1000))%26;
                        char ch=(char)(rand+'a');
                        ret.append(ch);
                        try{
                                Thread.sleep(1);
                        }catch(InterruptedException e){
                                e.printStackTrace();
                        }
                }
                return ret.toString();
        }
}