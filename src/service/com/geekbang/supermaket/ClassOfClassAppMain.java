package service.com.geekbang.supermaket;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassOfClassAppMain {
        public static void main(String ...args) throws NoSuchFieldException, NoSuchMethodException {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);
                MerchandiseV2 m100 = superMarket .getMerchandiseOf(100);
                //TODO Object类里的getclass方法，可以得到
                Class clazz = ShellColorChangePhone .class ;
                System.out.println(clazz.getName() );
                System.out.println(clazz .getSimpleName() );;

                //TODO 通过一个类的Class实例，可以获得一个类的所有信息，包括成员变脸，方法等
//               Field countField = clazz .getField("count ");
//               Field countField = clazz .getField("count")'
//
//               Method buyMethod = clazz .getMethod("buy",int .class ,String .class ) ;
//               Method euqalsMethod = clazz .getMethod("equals",Object.class) ;
//               clazz .getMethod("euqals",Object .class) ;
        }
}