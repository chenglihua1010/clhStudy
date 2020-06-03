package service.com.geekbang.supermaket;

import java.util.Scanner;

public class StringequalsAppMain {
        public static void main(String[] args) {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);
                String s1 = "aaabbb";
                String s2 = "aaa"+"bbb";
                System.out.println("s1");
                System.out.println("s1和s2用==判断结果："+(s1==s2));
                System.out.println("s1和s2用.equals判断结果："+(s1.equals(s2) ));

                //TODO java对String的优化（String不可变性）

                Scanner scanner = new Scanner(System .in);

                System.out.println("请输入s1");
                s1 =scanner .nextLine() ;

                System.out.println("请输入s2");
                s2= scanner .nextLine() ;

                System.out.println("s1和s2用==判断结果："+(s1==s2));
                System.out.println("s1和s2用.equals判断结果："+(s1.equals(s2) ));


        }
}