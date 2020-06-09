package service.Exception;

public class MustHandel {
        public static void main(String[] args) throws ClassNotFoundException {
               try{
                        Class clazz=Class.forName("Exception.MustHandle");
               }catch(ClassNotFoundException e){
                       e.printStackTrace();
               }
        }
}