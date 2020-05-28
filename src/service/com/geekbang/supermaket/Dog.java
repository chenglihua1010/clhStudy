package service.com.geekbang.supermaket;

public class Dog {
        public static String type;
        public static String color;
        public static String age;

        //预加载，static8静态代码块
        static
        {
                type="金毛";
                color="棕色";
                age="1岁";
        }

        public static void main(String[] args) {
                System.out.println(type);
                System.out.println(color);
                System.out.println(age);

        }

}