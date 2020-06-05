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

        @Override
        public void he(){
                System.out.println("我是apple里面的hehe1");
        }

        @Override
        public void he1() {

        }

        public static void main(String[] args) {
                Fruit fruit=new Apple();
                fruit.he();

                Fruit fruit1=new Fruit() {
                        @Override
                        public void eat() {

                        }

                        @Override
                        public void see() {

                        }

                        @Override
                        public void he1() {

                        }

                };
                fruit1.he();

        }


}