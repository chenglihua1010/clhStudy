package service.wwtest;

import java.util.*;

/**
 * Created by wangwu on 2020/6/10.
 */
public class CollectionList {
    public static void main(String[] args) {
        String a="a";
        String b="b";
        String c="c";
        String d="d";
        String e="e";

        //ArrayList集合--数据结构为数组
        List<String> stringList=new ArrayList<String>();
        stringList.add(a);
        stringList.add(b);
        stringList.add(c);
        stringList.add(d);
        stringList.add(e);

        //LinkedList集合--数据结构为双链表
        List<String> linkedList=new LinkedList<String>();
        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);
        linkedList.add(d);
        linkedList.add(e);


        //数组
        String[] shuzu=new String[]{a,b,c,d,e};

        //TreeSet
        Set<String> set=new TreeSet<String>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);


        //HashMap
        Map<String,String> map=new HashMap<String,String>();
        map.put("a",a);
        map.put("b",b);
        map.put("c",c);
        map.put("d",d);
        map.put("e",e);



    }
}
