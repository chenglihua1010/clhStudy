package service;

public class BitCalc {
        public static void main (String[] args ){
                int a = 0xF8;//
                int b = 0xF4;
                int c = 0xFF;
                System.out.println( a & b );
                System.out.println( a | b );
                System.out.println( a ^ b );
                System.out.println( ~c );
                System.out.println(5/2.0);
                System.out.println(4%2);
                System.out.println(4/2);
        }

}