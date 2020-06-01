package service.wwtest;

//apple类实现了fruit接口,要么变成抽象类，要么实现全部方法
public class Apple implements Fruit{
        @Override
        public void eat() {
                System.out.println("苹果好吃");
        }

        //Override是注解，覆盖接口里面的see方法
        @Override
        public void see() {
                System.out.println("苹果好看");
        }



}