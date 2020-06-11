package service.com.Exception.learnannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReadAnnotationAppMain {
        public static void main(String[] args) throws NoSuchMethodException {
                Class clazz=TestUseAnnotation.class;
                Method method=clazz.getMethod("test");
                for(Annotation annotation:method.getAnnotations()){
                        System.out.println(annotation.annotationType());
                }
                //TODO 读取到注解的内容后，可以根据注解的内容，作为相应功能的配置，来实现相应的功能
                PrimaryProperty primaryProperty=method.getAnnotation(PrimaryProperty.class);
                System.out.println(primaryProperty.abc());
                System.out.println(primaryProperty.defaultValue());
                System.out.println(primaryProperty.defaultValues());
                System.out.println(primaryProperty.targetClass());
        }


}