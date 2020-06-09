package service.Exception;

import service.Exception.MyException.MyException;
import service.Exception.MyException.MyRuntimeException;

public class Caller3 {
        public void callThrowRTException() {
                //TODO 可以将checked exception包装成unchecked exception或者checked exception
                //TODO 可以在这里catch异常，然后封装成自己的异常，并增加相应的异常描述

                System.out.println("Caller3.callThrowRTException开始");
                try{
                Object n = null;
                n.toString();
                }catch(Exception ex){
                        System.out.println("这种情况很正常，开始凌波微步到指定地点继续处理程序");
                        throw new MyRuntimeException("执行callThrowRTException出错",ex);
                }
                System.out.println("Caller3.callThrowRTException结束");
        }

        public void callThrowException() throws MyException {
                //TODO 可以在这里catch异常，然后封装成自己的异常，并增加相应的异常描述
                System.out.println("Caller3.callThrowException开始");
                try{
                        Class.forName("com.neverland.Rabbit");
                }catch(ClassNotFoundException ex){
                        throw new MyException("",ex);
                }

                System.out.println("Caller3.callThrowException结束");
        }
}