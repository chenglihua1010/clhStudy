package service.com.geekbang.supermaket;

public class OverloadAndOverrideTsetAppMain {
        public static void main(String[] args) {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场","世纪大道1号",500,600,100) ;
                MerchandiseV2 m= superMarket.getMerchandiseOf(100);

                //TODO 让重载的归重载，剩下的时覆盖的舞台
                //TODO 重载决定了要调用参数为int的方法，这个方法要在m指向的对象上执行
                //TODO 好巧不巧，这个对象老复杂了，是个ShellColorChangePhone对象
                //TODO 分别用true，1，3，6做参数做参数运行结果时什么？
                m.buy(6);
                m.buy(1);
                m.buy(3);

        }
}