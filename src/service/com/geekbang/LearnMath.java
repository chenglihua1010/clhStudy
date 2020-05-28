package service.com.geekbang;


import java.util.Random;

public class LearnMath {

        public double abc ;
        //TODO 我们 调用的都是Math的静态方法，Math的构造函数时private的意味着不能创建Math类的实例
        public static void main(String[] args) {
         //TODO 原来归根结底，Math的random是用的Random类来实现的。他在java.util包里
                System.out.println(Math.random() );
                //TODO nextInt的返回值有正负数，使用别人的类之前，先看看文档避免出现问题

                Random random = new Random();
                for (int i = 0; i<100; i++){
                        System.out.println(random .nextInt() );
                }
                System.out.println(Math.abs(-9));
                //Math.abs取绝对值
                System.out.println(Math.round(-9.5));
                System.out.println(Math .round(-9.8) );
                System.out.println(Math .round(9.5) );
                System.out.println(Math .round(9.8) );
                //Math.round 取整
        }
}