package service.com.geekbang.supermaket;

public class TestFinalRefAppMain {
        public static void main(String[] args) {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);
                Phone ph = (Phone )superMarket .getMerchandiseOf(10);


                MerchandiseV2 gift = ph.getGift() ;


        }

}