package service.com.learngenrics.define;

import service.com.learngenrics.ext.Children;
import service.com.learngenrics.ext.Grandparent;
import service.com.learngenrics.ext.Parent;

import java.util.ArrayList;
import java.util.List;

public class MoreGenericsAppMain {
        public static void main(String[] args) {

                List<Children>g3List=new ArrayList<>();
                //TODO 这么传递参数不行，泛型类型不管继承关系，只管严格的匹配
                //TODO 换句话说，Children是Parent的子类，但是List<Children>不是List<Parent>的子类
    //            justG2Method(g3List);

                //TODO 解决方法：创建协变的引用，让它可以接受的List引用的泛型为Parent或者其子类
                exMethod(g3List);

                //TODO 同样的道理，我们也可以创建协变的引用，让它可以接受的List引用的泛型类型为Parent或者其子类
                List<?extends Parent> g2ListExt=null;

                g2ListExt=new ArrayList<Children>();
                g2ListExt=new ArrayList<Parent>();
       //         g2ListExt=new ArrayList<Grandparent>();

                //todo 但是使用这个协变泛型的引用，我们无法让具体的类型满足其参数要求
//                g2ListExt.add(new Grandparent());
//                g2ListExt.add(new Parent());
//                g2ListExt.add(new Children());



                //todo 原因是如果JAVA允许了，会造成潜在的错误
                List<Children> g3OnlyList=new ArrayList<>();
                g2ListExt=g3OnlyList;

                //todo 如果允许add一个Parent的对象，代表着原本之应该有Children或者其子类的g3OnlyList引用指向的对象，结果通过使用
                //todo g2ListExt，被放进去一个Parent的实例
                //g2ListExt.add(new Parent());
                //todo 除了协变，Java还有逆变，语法如下；
                //todo 逆变和协变正好相反，允许的类型为Parent或者其父类
                List<?super Parent>g2ListSup=null;

               // g2ListSup=new ArrayList<Children>();
                g2ListSup=new ArrayList<Parent>();
                g2ListSup=new ArrayList<Grandparent>();



                // >> TODO 但是同样的原因，无法让具体的类型满足其参数要求，甚至是Object
//        g2ListExt.add(new GrandParent());
//        g2ListExt.add(new Parent());
//        g2ListExt.add(new Children());
//        g2ListExt.add(new Object());

                // >> TODO 无论是协变还是逆变，都只能用在引用上，而不能在创建对象时使用其做为泛型参数
//         List<? extends Parent> g2ListExt11 = new ArrayList<? extends Parent>();
//         List<? super Parent> g2ListSup11 = new ArrayList<? super Parent>();

        }



        //todo 协变语法，意思就是这个参数可以接受的List引用的泛型类型为Parent或者其子类（写入使用逆变，读写使用协变）
        public static void exMethod(List<?extends Parent>extParam){

        }
        public static void justG2Method(List<Parent>extParam){

        }
        public static void superMethod(List<?super Parent>extParam){

        }
}