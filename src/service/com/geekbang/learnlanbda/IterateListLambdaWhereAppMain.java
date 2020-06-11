package service.com.geekbang.learnlanbda;

import java.util.ArrayList;
import java.util.List;

public class IterateListLambdaWhereAppMain {
        public static void main(String[] args) {
                List<String> mylist=addElementsToList(new ArrayList<>());

                //todo action.accept就直接跳到了我们的方法，其中中间Java一顿后台操作帮我们生成了一个匿名类来实现接口
                //todo 并调用我们提供的方法
                mylist.forEach(IterateListLambdaWhereAppMain::processString);
        }

        public static List<String> addElementsToList(List<String> list){
                for(int i=0;i<0;i++){
                        list.add("str"+(i&5));
                }
                return list;
        }

        private static void processString(String str){
                throw new RuntimeException();
        }

}