package service.com.geekbang.Learn;


import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

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

        public static class LearnScanner {
                //>>TODO Scanner是一个方便的可以帮我们从标准输入读取并转换数据的类
                //>>TODO @since 1.5 表示它是从Java5才开始有的
                public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in );

                        //>>TODO 但是这并不是说从Java5开始这个类没有变化过
                        //>>TODO 在源代码里搜索下@since，会发现很多方法是在后续的Java版本中加进去的
                        //>>TODO 但是private方法就不会有这个文档标识，因为private方法本来就不给用

                        System.out.println("请输入一个巨大的整数");
                        //BigInteger Java中存在的一个类，可直接调用
                        BigInteger bigInteger = scanner.nextBigInteger() ;
                        System.out.println("请输入像个这个数加多少");
                        BigInteger toBeAdd = scanner .nextBigInteger() ;
        //                bigInteger .add(toBeAdd )为BigInteger类的名叫”add()“的方法
                        System.out.println("结果为："+bigInteger .add(toBeAdd ));

                }
        }
}