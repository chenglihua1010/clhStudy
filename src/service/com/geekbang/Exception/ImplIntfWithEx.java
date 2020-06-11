package service.com.geekbang.Exception;

public class ImplIntfWithEx implements IntWithEx{
        @Override
        public Void danger() throws Exception {
                //TODO 接口中声明了抛出异常，实现类中可以抛，也可以不抛。抛的话必须是接口声明的类活着其子类
                throw new Exception("");
        }

        @Override
        public void safe() {
                //TODO 接口中没有声明怕抛出异常，实现类中可以抛出RuntimeException,也可以不抛
                //TODO 如果抛check exception，就会chucuo
                //TODO 可以选择catch住checkd exception，然后将它封在RuntimeException里
//                throw new Exception();
//                throw new RuntimeException();

        }
}