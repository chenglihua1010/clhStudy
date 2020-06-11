package service.com.geekbang.learnlanbda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class IterateListLambdaAppMain {
        public static void main(String[] args) {
                List<String> mylist=addElementsToList(new ArrayList<>());
                String outside="ourside string";

                for(String s:mylist){
                        processString(outside+s);
                }
                //TODO 匿名内部类版
                mylist.forEach(
                                new Consumer<String>() {
                                        @Override
                                        public void accept(String s) {
                                                processString(outside+s);
                                        }
                                }
                );
                //TODO lambda的表达式必须能够符合接口中定义的抽象方法，从参数，到返回值，到异常都必须匹配
                //TODO lambda完整版（参数）->{代码块}
                //TODO lambda可以有返回值，使用return语句就可以，我们这个接口没有，lambda表达式也不能有
                //TODO lambda可以使用外部数据
                mylist.forEach(
                                (s) ->{
                                        processString(outside+s);
                                }
                );

                //TODO lambda单参数，代码单行，简化版
                mylist.forEach(s -> processString(outside+s));

                //TODO lambda如果不使用外部变量，还有方法引用终极简化版
                mylist.forEach(IterateListLambdaAppMain::processString);

                //TODO lambda方法引用终极简化版：不是静态方法，用引用也可以
                IterateListLambdaAppMain inst=new IterateListLambdaAppMain();
                mylist.forEach(inst::processStringInst);//new?

                //TODO lambda也允许指定一个参数类型里的一个方法作为方法的引用
                mylist.forEach(String::toUpperCase);

                Map<String,String> myMap=new HashMap<>();
                myMap.put("k1","v1");
                myMap.put("k2","v2");
                myMap.put("k3","v3");
                //TODO 两个参数也没问题，把参数用括号扩起来，用逗号分开
                myMap.forEach((k,v)-> processTwoString(k,v));
                //TODO 省略也没问题
                myMap.forEach(IterateListLambdaAppMain::processTwoString);

        }


        public static List<String> addElementsToList(List<String> list){
                for(int i=0;i<22;i++){
                        list.add("str"+i);
                }
                return list;
        }

        private static void processString(String str){
                System.out.println(str);
        }

        private static void processTwoString(String str1,String str2){
                System.out.println("s1="+str1+",s2="+str2);
        }

        private void processStringInst(String str){
                System.out.println(str);
        }
}