package service.com.geekbang.learnlanbda;

import java.util.function.Function;

public class LambdaWithReturnValue {
        public static void main(String[] args) throws Exception {
                String ret=randonData(String::valueOf);
                System.out.println(ret);

                String retException=randomDataWithExceptionHanding(String::valueOf);
                System.out.println(retException);
        }



        //todo 我有数据，你有代码吗？
        public static String randonData(Function<Object,String> converter){
                return converter.apply(Math.random());
        }
        //todo lamda如果有checked exception异常，那么接口必须允许，在调用的地帆帆，只要正常处理异常就可以
        public static String randomDataWithExceptionHanding(ExceptionLambda<Object,String> converter) throws Exception {
                //todo 正常的异常处理
                return converter.hasException(Math.random());

        }

        interface ExceptionLambda<P,R>{
                R hasException(P p) throws Exception;
        }
}