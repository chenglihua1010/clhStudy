package service.wwtest;

public class Peal {
        public static void main(String[] args) {
//                see();
//                see("67676");
//                see("aa77","bb00");
                String aa="123";

                Apple apple=new Apple();
                Object apple1=new Object();
                System.out.println(apple.hashCode());
                System.out.println(apple1.hashCode());
                System.out.println(aa.hashCode());

        }

        public  static void see(){
                System.out.println("梨子好看");
        }

        public static void see(String aa){
                System.out.println("梨子好看"+aa);
        }


        public static void see(String aa,String bb){
                System.out.println("梨子好看");
        }


}