package service.com.geekbang.Exception;

public class NotHaveToHandle {
        public static void main(String[] args) throws NullPointerException{
                String str=null;
                str.toLowerCase();
        }
}