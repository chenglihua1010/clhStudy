package service.Exception;

public class ThorwsIt {
        //TODO 可以使用throws关键字，抛出一个异常
        //TODO 抛出的异常类型，可以是实际异常的父类活着本身
        //TODO 可以抛出多种类型的异常，用逗号分开

        public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
                Class clazz=Class.forName("abc");
                clazz.getField("");
        }
}