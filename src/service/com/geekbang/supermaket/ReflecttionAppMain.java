package service.com.geekbang.supermaket;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecttionAppMain {
        public static void main(String ...args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);
                MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);

                Class clazz = MerchandiseV2.class ;

                //获取所有的变量
                Field[] fields=clazz.getFields();
                System.out.println(fields.toString());

                //获取某一个变量
                Field countFiled = clazz .getField("count");
                System.out.println(countFiled .getName() );

                //给count变量赋值
                countFiled .set(m100,999);
                System.out.println(countFiled .get(m100) );
                System.out.println(m100.count );

                printFields(clazz);

                Field field = clazz .getField("STATIC_MEMBER");
                System.out.println(field .get(null) );

                Method desMethod = clazz.getMethod("describe");
                desMethod.invoke(m100);

                System.out.println(desMethod.toString());//

                Method staticMethod = clazz.getMethod("getName");
                String str = (String) staticMethod.invoke(m100);
                System.out.println(str);

            //    m100.buy(10);






   //             Method descMethod = clazz .getDeclaredMethod("descMethod ");
//                descMethod.setAccessible(true);
//                descMethod.invoke(m100);
//                descMethod.invoke(superMarket.getMerchandiseOf(0));
//                descMethod.invoke(superMarket.getMerchandiseOf(10));
        }
                public static void printFields(Class clazz ){
                System.out.println(clazz .getName() +"里的field");
//                for (Field field :clazz.getFields() ){
//                        System.out.println(field .getType() +""+field .getName() );
//                }

                        Field[] fields=clazz.getFields();
                 for(int i =0 ;i<fields.length;i++){

                         System.out.println(fields[i].getType()+" "+fields[i].getName());
                 }
        }

}