package service.com.geekbang.supermaket;

public class MerchandiseV2DescAppMain {
        public static void main(String[] args) {
                MerchandiseV2WithConstuctor merchandise = new MerchandiseV2WithConstuctor
                                ("书桌", "DESK9527", 40, 999.9, 500);

                // >> TODO 如果我们自己添加类构造方法，Java就不会再添加无参数的构造方法。
                // >> TODO 这时候，就不能直接 new 一个对象不传递参数了
         //       MerchandiseV2WithConstructor merchandise2 = new MerchandiseV2WithConstructor();

                merchandise.describe();
        //        MerchandiseV2 merchandise = new MerchandiseV2();
                //以MerchandiseV2为对象，构造名为merchandise 的实例
/*
                merchandise .name = "书桌";
                merchandise .soldprice =999.9;
                merchandise .purchasePrice  = 500;
                merchandise .id ="DESK9527";
                merchandise .count = 40;
                */
       //         merchandise.init("书桌", "desk9527", 40, 999.9, 500);
   /*             merchandise .buy() ;

                //调用MerchandiseV2的 describ方法--XXX.describ();
                merchandise .describ() ;

                double cost = merchandise .buy(10);
                System.out.println(cost);
                merchandise .describ() ;

                double costVip = merchandise.buy(10,true);
                System.out.println(costVip);
                merchandise .describ();

    }
 */
        }
}