package service.com.geekbang.Exception;

import service.com.geekbang.Exception.MyException.MyException;

public class CallerExceptionAppMain {
//        public static void main(String[] args) throws MyException {
//                makeCall();
//        }
//
//        private static void makeCall() throws MyException {
//                //TODO 检查异常强制处理，需要明确的throws或者catch
//                Caller1 caller1=new Caller1();
//                System.out.println("调用开始");
//                caller1.call2Exception();;
//                System.out.println("调用结束");
//        }

        public static void main(String[] args) throws MyException {
                //TODO catch语句是根据异常类型匹配来捕捉相应类型的异常
                //TODO 如果类型不匹配，catch语句是不会执行，异常会持续抛出
                //TODO 也就是说catch（throwable）会捕捉到所有的异常，包括error，建议最多只捕捉exception
                //TODO 如果catch一个其实并没有抛出的checkde exception，Java程序会报错，因为Java程序明确知道这个类型的异常不会发生
                //TODO 如果catch一个unchecked exception，Java程序不会报错
                //TODO 如果throws一个其实并没有被抛出的checkde exception或者unchecked exception，java程序不会报错
                Caller1 caller1=new Caller1();
                System.out.println("调用开始");

                caller1.call2Exception();

                System.out.println("调用结束");
        }
}