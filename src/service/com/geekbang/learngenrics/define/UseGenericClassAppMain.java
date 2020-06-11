package service.com.geekbang.learngenrics.define;

import java.util.ArrayList;
import java.util.List;

public class UseGenericClassAppMain {
        public static void main(String[] args) {
                //useStringList();
                useStringListGenerics();
        }

        private static List createStringList(){
                List ret=new ArrayList();
                for(int i=0;i<10;i++){
                        ret.add("str"+(i%5));
                }
                return ret;
        }

        private static void useStringList(){
                List strList=createStringList();
                for(int i=0;i<strList.size();i++){
                        //TODO 必须强制类型转换，即使里面只有string
                        String str=(String)strList.get(i);
                        str=str.toUpperCase();//改大写
                }
        }
        //todo 告诉Java；这个List里只有String,方法就是使用泛型
        private static List<String> createStringListGenerics(){
                //TODO 泛型的语句就是在支持泛型（<>）的类型上，给出类型的定义
                //TODO List接口是支持泛型的，类型就是List里允许的元素的类型
                //TODO 创建List实例和引用的时候，都可以（非必要）指定泛型相对应的类型
                //TODO 不指定就是Object,所以我们之前用的List的元素就是Object类型
                List<String> ret=new ArrayList<>();
                for(int i=0;i<10;i++){
                        ret.add("str"+(i%5));
                }
                return ret;
        }

        private static void useStringListGenerics(){
                //TODO 使用List<STring>类型的引用，指向泛型的List
                List<String> strList=createStringList();
                for(int i=0;i<strList.size();i++){
                        String str=strList.get(i).toUpperCase();
                        System.out.println(str);
                }
        }
}