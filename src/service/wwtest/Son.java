package service.wwtest;

public class Son extends Father{
        public void myWork(){
                System.out.println("程序员");
        }

        public void myAge(){
                System.out.println(25);
        }
        public static void main(String[] args) {
                //继承，申明用Father，实例对象用Son
                //父亲有，儿子没有，调父亲的
                //父亲有，儿子有，调儿子的
                //父亲没有，编译报错
//                Father father=new Son();
//                father.myWork();
//                father.myAge();

                //父亲有，儿子没有，调父亲的
                //父亲有，儿子有，调儿子的
                //父亲没有，儿子有，调自己的
//                Son son=new Son();
//                son.myWork();
//                son.myAge();

                //直接调用Father的
                Father father=new Father();
                father.myWork();
                father.myAge();
        }
}