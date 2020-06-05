package service.wwtest;

import javax.naming.ldap.Rdn;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by wangwu on 2020/6/3.
 */
public class ColorTest {
    public static void main(String[] args) throws Exception {
            Blue blue=new Blue();
            blue.setPrice(new Integer(1));


Red red =new Red();


//            ColorEntity colorEntity = new Blue();

        testDuibidu(blue);


//            Red red=new Red();
//            testDuibidu(red);
//
//            ColorEntity colorEntity=new ColorEntity(){
//
//            };
//
//
//            testDuibidu(colorEntity);

    }

        public static void testDuibidu(ColorEntity color) throws Exception {
                //得到当前传进来color对象的getPrice方法
                //写法一,利用泛型写法
//                Class<? extends ColorEntity> clazz1 = color.getClass();
                //写法二,不利用泛型写法
                Class clazz = color.getClass();
    //            Method method = clazz.getMethod("getPrice", null);

                Field[] fields=clazz.getDeclaredFields();

                //获取到不同对象的属性值来区分不同的实例对象
Field zishufiled = clazz.getDeclaredField("zishu");
                zishufiled.setAccessible(true);

if (zishufiled == null){
        System.out.println("我是red");
}else {
        System.out.println("我是blue");
}


                //获取到Blue对象传进来的价格
//                Object object = method.invoke(color);
//                System.out.println(object.toString());


    }
}
