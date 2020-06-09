package service.Exception.MyException;

public class MyException extends Exception{
        public MyException(){

        }

        public MyException(String message){
                super(message);//描述异常的信息
        }

        public MyException(String message,Throwable cause){
                super(message,cause);
        }

        public MyException(Throwable cause){
                super(cause);//cause；谁引起的异常
        }
}