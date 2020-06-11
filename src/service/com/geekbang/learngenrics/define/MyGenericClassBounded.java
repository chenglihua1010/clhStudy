package service.com.geekbang.learngenrics.define;

import service.com.geekbang.learngenrics.ext.Grandparent;

public class MyGenericClassBounded<MyTybe extends Grandparent> {

        //todo 实际上这个引用是Grandparent类型的
        private MyTybe myTybe;

        public MyGenericClassBounded(MyTybe myTybe){
                //todo 所以这里可以通过这个引用，调用Grandparent的方法
                myTybe.getNum();
                this.myTybe=myTybe;
        }

        public void setMyTybe (MyTybe myTybe){
                this.myTybe=myTybe;
        }

}