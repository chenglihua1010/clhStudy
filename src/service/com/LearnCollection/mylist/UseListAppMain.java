package service.com.LearnCollection.mylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class UseListAppMain {

        public static void main(String[] args) {
                prinCollection(addElementsToCollection(new ArrayList()));
                prinCollection(addElementsToCollection(new LinkedList()));

//                prinCollection(addElementsToCollection(new MyArryList()));
//                prinCollection(addElementsToCollection(new MyLinkedList()));

                printList((List)addElementsToCollection(new ArrayList()));
                printList((List)addElementsToCollection(new MyArryList()));
                printList((List)addElementsToCollection(new MyLinkedList()));

        }
                public static Collection addElementsToCollection(Collection collection){
                        for(int i=0;i<10;i++){
                                collection.add("str"+(i%5));
                        }
                        return collection;
                }
//两种遍历
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

        public static void printList(List list){
                System.out.println();
                System.out.println("输出"+list.getClass()+"中的元素，共"+list.size()+"个");
                //没实现Iterable
                for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i));
                }

        }

}