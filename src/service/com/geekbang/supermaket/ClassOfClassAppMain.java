package service.com.geekbang.supermaket;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassOfClassAppMain {
        public static void main(String... args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);
                MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);
                //TODO Object类里的getclass方法，可以得到类的名字
                Class clazz = ShellColorChangePhone.class;
                System.out.println(clazz.getName());
                System.out.println(clazz.getSimpleName());

//
//                Field[] fields=clazz.getFields();
//                System.out.println(fields.toString());
//
//                Field countFiled = clazz .getField("count");
//                System.out.println(countFiled .getName() );




                //TODO 通过一个类的Class实例，可以获得一个类的所有信息，包括成员变脸，方法等
                Field countField = clazz.getField("count");
                System.out.println(countField.getName());

                 Field pricetField = clazz.getField("id");

   //          Method buyMethod = clazz.getMethod("buy");


//              Method euqalsMethod = clazz.getMethod("equals", Object.class);
//               clazz.getMethod("euqals", Object.class);
        }
}