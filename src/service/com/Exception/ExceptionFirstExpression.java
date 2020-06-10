package service.com.Exception;

public class ExceptionFirstExpression {
        public static void main(String[] args) {
                //TODO try语句中如果发生了异常（exception），那么程序会跳转到catch语句中
                //TODO Java会讲异常相关信息封装在一个异常类的实例中，ex是指向这个异常实例的引用
                //TODO “处理”最简单的方法，就是调用printStasckTcace将异常信息输出到控制台
                //TODO catch语句执行完毕，程序会继续向下执行
                //TODO 作用，捕获异常（输出在控制台），让程序继续执行

                try {
                        int[] arr = new int[1];//建一个数组长度为1的数组
                        arr[1] = 9;
                        //arr[0]=9;
                } catch (Exception ex) {
                        ex.printStackTrace();//出错过程输出
                }


                try {
                        String str="";
                        str.substring(9,10);//截取第9+1到第十个不包括第十个，字符
                }catch (Exception ex){
                        ex.printStackTrace();
                }

                System.out.println("程序执行结束");
        }
}