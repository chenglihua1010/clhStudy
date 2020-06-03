package service.com.geekbang.supermaket;

public class ToStringAppMain {
        public static void main(String[] args) {
                LitterSuperMarket superMarket =new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);

                MerchandiseV2 m100 = superMarket .getMerchandiseOf(100);

                StringBuilder stringBuilder = new StringBuilder() ;
                stringBuilder .append("商品100是：").append(m100);
                //TODO 因为tostring是object里的方法，所以任何一个Java对象都可以用这个方法

                System.out.println(stringBuilder .toString() );
                System.out.println(m100);
        }
}