package service.com.geekbang.learnthread.learnvolatile;

public class DataHolder {
        int a,b,c,d,f,g;
       long e;
        //TODO 有volatile修饰会影响之前的指令重排
       // volatile long e;

        public void operateData(){
                //TODO 按照这个顺序执行，g的值肯定小于等于e的。但是实际执行在执行的时候，可能会为了优化的目的重排
                a+=1;
                b+=1;
                c+=1;

                e+=1;

                d+=1;
                f+=1;
                g+=1;

        }
        int counter;

        public void check(){
                if(g>e){
                        System.out.println("got it"+(counter++));
                }
        }
}