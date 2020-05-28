package service.com;

import service.com.geekbang.supermaket.LitterSuperMarket;
import service.com.geekbang.supermaket.MerchandiseV2;

public class RunLittleSupperMarketAppMainV2 {
        public static void main(String[] args) {
                        LitterSuperMarket littleSuperMarket = new LitterSuperMarket();
                        littleSuperMarket.address = "世纪大道666号";
                        littleSuperMarket.supermaketName = "有家超市";
                        littleSuperMarket.parkingCount = 200;
                        littleSuperMarket.merchandises = new MerchandiseV2[200];
                        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
                        MerchandiseV2[] all = littleSuperMarket.merchandises;

                        MerchandiseV2 giftNoodle = new MerchandiseV2();
                        giftNoodle.name = "赠品-面条";
                        giftNoodle.count = 2000;
                        giftNoodle.purchasePrice = 5;
                        giftNoodle.soldprice = 0.05;
                        giftNoodle.id = "GIFT001";

                        MerchandiseV2 giftBowl = new MerchandiseV2();
                        giftBowl.name = "赠品-碗";
                        giftBowl.count = 2000;
                        giftBowl.purchasePrice = 8;
                        giftBowl.soldprice = 0.08;
                        giftBowl.id = "GIFT002";

                        for (int i = 0; i < all.length; i++) {
                                MerchandiseV2 m = new MerchandiseV2();
                                m.count = 200;
                                m.id = "ID" + i;
                                m.name = "商品" + i;
                                m.purchasePrice = Math.random() * 200;
                                m.soldprice = (1 + Math.random()) * m.purchasePrice;
                                all [i] = m;
                                m.describ();
                        }
                        int index = 0;

                        MerchandiseV2 m = littleSuperMarket.merchandises[index];

                        // >> TODO 方法的代码可以影响方法之外的数据。我们可以通过指向同一个对象的引用，操作这个对象里的属性
                        MerchandiseV2 paramRef = littleSuperMarket.merchandises[2];

                        m.gift = giftBowl;
                        System.out.println("gift变换大法执行前");
                        m.describ();
                        paramRef.describ();
                        m.changeToTheSameGift(paramRef);
                        System.out.println("gift变换大法执行后");
                        paramRef.describ();

                        // >> TODO 给返回值赋值，并不会影响用来充当返回值的变量

                        MerchandiseV2 giftOfM;

                        // >> TODO 可以通过返回值，操作同一个对象

                        System.out.println("获取m的赠品，并修改这个赠品对象的采购价格");
                        System.out.println("修改前");
                        m.describ();
                        giftOfM = m.getGiftAndHowCanOutsideChangeIt();
                        giftOfM.purchasePrice = giftOfM.purchasePrice * 10;
                        System.out.println("修改后");
                        m.describ();
                }


}
