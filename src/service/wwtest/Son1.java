package service.wwtest;

public class Son1 extends Father{
        public void myWork(){
                System.out.println("我是第二个儿子，我的工作是司机");
        }


        public void myAge(){
                System.out.println("我是第二个儿子，我今年33岁");
        }

        public static void main(String[] args) {
                //创造一个son1实例对象，指向father
                Father son1=new Son1();

                //调用son1的工作和年龄方法
                son1.myAge();
                son1.myWork();

                //调用father的工作和年龄方法
                Father father =new Father() ;
                father.myWork();
                father.myAge();



        }
}