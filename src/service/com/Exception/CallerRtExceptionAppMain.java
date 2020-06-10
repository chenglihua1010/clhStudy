package service.com.Exception;

import service.com.Exception.MyException.MyRuntimeException;

public class CallerRtExceptionAppMain {
        public static void main(String[] args)  {
                makeCall();
        }

        private static void makeCall(){
                //TODO RuntimeException，也就是unchecked exception不强制处理
                Caller1 caller1=new Caller1();
                System.out.println("调用开始");
                try{
                        caller1.call2RTException();
                }catch(MyRuntimeException ex){
                        System.out.println("凌波微步收到");
                }


                System.out.println("调用结束");
        }
}