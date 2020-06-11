package service.com.geekbang.LearnCollection.Learnmap;

import java.util.HashMap;
import java.util.Map;

public class LearnMapAppMain {
        public static void main(String[] args) {

                Map<String,String>map=creatMap(99);
                //todo 通过get方法，得到传递的key对应的值
                //todo 注意：get方法并没有使用泛型，它的类型是Object
                System.out.println(map.get("key20"));
                //todo 如果没有key，或者key对应的值就是null,那么返回null;
                System.out.println(map.get(new Object()));
                System.out.println(map.get("key999"));

                //todo 注意：不是每种Map的实现都允许key或者value为null，使用时需要注意
                map.put(null,"value of null key");
                map.put("testnull",null);

                System.out.println("null key value:"+map.get(null));
                System.out.println("null value support:"+map.get("testnull"));

                //todo 删除key
                System.out.println("-----删除key-----");

                String keyToRemove="key9";
                System.out.println(keyToRemove+"对应的值是："+map.get(keyToRemove));
                map.remove(keyToRemove);
                System.out.println("执行删除操作后，"+keyToRemove+"对应的值是："+map.get(keyToRemove));

                System.out.println("-----遍历value-----");
                for(String value:map.values()){
                        System.out.println(value);
                }
                System.out.println("-----遍历key------");
                for(String key:map.keySet()){
                        System.out.println(key);
                }

                System.out.println("-----遍历key和value");
                for(Map.Entry<String,String>entry:map.entrySet()){
                        System.out.println("key为："+entry.getKey()+"，value为："+entry.getValue());
                }

        }





        //TODO 创建HashMap实例，并按照泛型的定义，向里面放入key和value
        public static Map<String,String>creatMap(int size){
                Map<String, String>ret=new HashMap<>();
                for(int i=0;i<size;i++){
                        //todo put的第一个为key,第二个为value
                        ret.put("key"+i,String.valueOf(Math.random()));
                }
                return ret;
        }

}