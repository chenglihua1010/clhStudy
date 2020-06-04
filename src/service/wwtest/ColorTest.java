package service.wwtest;

import java.lang.reflect.Method;

/**
 * Created by wangwu on 2020/6/3.
 */
public class ColorTest {
    public static void main(String[] args) throws Exception{
    Blue blue=new Blue();
        blue.setPrice(new Integer(1));
        testDuibidu(blue);
    }

    public static void  testDuibidu(ColorEntity color)throws Exception{
       //得到当前传进来color对象的getPrice方法
        //写法一
//        Class<? extends ColorEntity> clazz=color.getClass();
        //写法二
        Class clazz=color.getClass();
        Method method=clazz.getMethod("getPrice",null);
        //获取到不同对象的 属性值来区分不同的实例对象


        //获取到Blue对象传进来的价格
        Object object=method.invoke(color);
        System.out.println(object.toString());
    }
}