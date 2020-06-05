package service.wwtest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wangwu on 2020/6/3.
 */
public class ColorTest {
    public static void main(String[] args) {
            Blue blue=new Blue();
            blue.setPrice(new Integer(1));
            blue.setZishu(new Integer(10));
            blue.setDuibidu(new String("GAO"));


   //     testDuibidu(blue);
            Class clazz = blue.getClass() ;
            Field[] fields = clazz.getFields();
            System.out.println(fields.toString());

        System.out.println(123);

    }

        public static void testDuibidu(ColorEntity color) throws Exception {
                //得到当前传进来color对象的getPrice方法
                //写法一,利用泛型写法
                Class<? extends ColorEntity> clazz1 = color.getClass();
                //写法二,不利用泛型写法
                Class clazz = color.getClass();
                Method method = clazz.getMethod("getPrice", null);
                //获取到不同对象的属性值来区分不同的实例对象
                System.out.println(123123);

                //获取到Blue对象传进来的价格
                Object object = method.invoke(color);
                System.out.println(object.toString());


    }
}
