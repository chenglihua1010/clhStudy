package service.Exception;

import service.Exception.MyException.MyException;

public class Caller1 {
        Caller2 caller2=new Caller2();

        public void call2RTException(){
                System.out.println("Caller1.call2ReException开始");
                caller2.call3RTException();
                System.out.println("Caller1.call2RtException结束");
        }

        public void call2Exception() throws MyException{
                System.out.println("Caller1.call2Exception开始");
                try{
                        caller2.call3Exception();
                }catch(MyException ex){
                        System.out.println("got exception in Caller1:"+ex.getMessage());
                }
                System.out.println("Caller1.call2Exception");
        }
}