package service.com.geekbang.learnannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//todo 注解可以被使用在哪个/些元素上
@Target(ElementType.METHOD)
//todo 注解会被保留在哪个阶段
@Retention(RetentionPolicy.RUNTIME)//SOURCE,CLASS,RUNTIMEN
//todo 以上两个元素是每个注解都必须有的


//todo 定义一个自己的annotation，需要@interface，实际上这个接口会继承Annotation接口
public @interface PrimaryProperty {
        //todo annotation支持的类型有基本数据类型，Class,String,枚举，其他注解，以上类型的
        //todo 数组可以指定缺省值
        String defaultValue() default "N/A";

        Class targetClass();

        int abc();

        String[] defaultValues();

        //TODO 注解类型的缺省值
        Override is()default @Override;
}