package service.com.geekbang.learnlanbda;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static service.com.geekbang.learnlanbda.IterateListLambdaAppMain.addElementsToList;

public class UseStreamAppMain {
        public static void main(String[] args) {
                List<String> mylist=addElementsToList(new ArrayList<>());
                System.out.println("-----lambda的奥义-----");
                //TODO lambda的奥义是使用lambda一个接着一个处理，不要停，一路处理下去，直到业务结束
                //todo 理性来说，lambda结构对计算优化是友好的；感性的说，这种方式让人感到舒适
                mylist.stream().filter(s->s.length()>4).map(String::toUpperCase).forEach(System.out::println);

                //todo 当然也可以使用collection让数据重新生成一个list
                System.out.println("-----使用collection-----");
                List<String> longgerStrList=mylist.stream().filter(s->s.length()>4).map(String::toUpperCase)
                                .collect(Collectors.toList());
                longgerStrList.forEach(System.out::println);
        }

}