package service.com.geekbang.LearnCollection.mylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class UseSetAppMain {
        public static void main(String[] args) {
                prinCollection(addElementsToCollection(new HashSet()));//去重，无序
                prinCollection(addElementsToCollection(new ArrayList()));


        }

        public static Collection addElementsToCollection(Collection collection) {
                for (int i = 0; i < 10; i++) {
                        collection.add("str" + (i % 5));
                }
                return collection;
        }

        public static void prinCollection(Collection collection){
                System.out.println();
                System.out.println("输出"+collection.getClass()+"元素种的元素，共"+collection.size()+"个");

                try{
                        for(Object element:collection){
                                System.out.println(element);
                        }
                }catch(Exception ex){
                        ex.printStackTrace();
                }
        }


}