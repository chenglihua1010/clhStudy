package service.com;

import service.com.geekbang.person.Customer;
import service.com.geekbang.supermaket.LitterSuperMarket;
import service.com.geekbang.supermaket.Merchandise;
import service.com.geekbang.supermaket.MerchandiseV2;

import java.util.Scanner;

        public class RunLittleSuperMarketAppMain {
        public static void main(String[] args) {
                LitterSuperMarket littleSuperMarket = new LitterSuperMarket();
                littleSuperMarket.address = "世纪大道666号";
                littleSuperMarket.supermaketName = "有家超市";
                littleSuperMarket.parkingCount = 200;
                littleSuperMarket.merchandises = new MerchandiseV2[200];
                littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
//为了方便使用，创建一个商品数组引用，和littleSuperMarket.merchandises指向同一数组对象
                MerchandiseV2[] all = littleSuperMarket.merchandises;

                // 遍历给200中商品赋值
                for (int i = 0; i < all.length; i++) {
                        MerchandiseV2 m = new MerchandiseV2();
                        m.count = 200;
                        m.id = "ID" + i;
                        m.name = "商品" + i;
                        m.purchasePrice = Math.random() * 200;
                        m.soldprice = (1 + Math.random()) * m.purchasePrice;
                        //用创建的商品，给商品数组的第i个引用赋值，all和小超市的数组引用指向的是同一数组对象
                        all[i] = m;
                }
                System.out.println("LittleSuperMarket的对象是" + littleSuperMarket);
                System.out.println("下面请利润最高的商品自我介绍：");
                MerchandiseV2 m = littleSuperMarket.getBiggestProfitMerchandise();
                m.describ();
                System.out.println("利润最高的MerchandiseV2的对象是：" + m);
                if (!m.hasEnoughCountFor(500)) {
                        System.out.println("补充库存");
                        int toBeAdd = 500;
                        littleSuperMarket.incomingSum -= toBeAdd * m.purchasePrice;
                        m.addCount(toBeAdd);
                }
        }
        }
// //①  程序（求最大利润）
//                LitterSuperMarket litterSuperMarket =new LitterSuperMarket() ;
//                litterSuperMarket.init ("有家超市","浦东新世纪大道666号",100,100,200,1000);
//
//                System.out.println("下面请利润最高的商品自我介绍：");
//                litterSuperMarket .getBiggestProfitMerchandise() .describ() ;
//        }
//}
//①
// ②程序（第二件半价）
 //方法二
/*
                Scanner scanner = new Scanner(System.in);
                MerchandiseV2 m0 = all[0];

                while (true) {
                        System.out.println("今日超市大特惠，所有商品第二件半价！选择要购买的商品索引为：");
                        int index = scanner.nextInt();

                        if (index < 0) {
                                System.out.println("欢迎再次光临");
                                break;
                        }
                        System.out.println("请输入要购买的数量");
                        int count = scanner.nextInt();
                        MerchandiseV2 m = littleSuperMarket.merchandises[index];
                        System.out.println(m.isTheBiggestTotalValueOne(littleSuperMarket ));
                        double totalCost = m.buy(count);
                        boolean m0BiggerTThan = m0 .totalValueBiggerTnan(m);
                        System.out.println("m0的总价值比用户选择的要大："+m0BiggerTThan );
                        System.out.println("商品总价为：" + totalCost);
                }

        }
}
*/


/*   方法一（第二件半价）
                        Scanner scanner = new Scanner(System.in);

                        while (true) {
                        System.out.println("今日超市大特惠，所有商品第二件半价！选择要购买的商品索引为：");
                        int index = scanner .nextInt();
                        if (index<0){
                                break;
                        }
                        if(index >=all.length ){
                                System.out.println("商品索引超出界限");
                                continue;
                        }
                        MerchandiseV2  m = all[index];
                        System.out.println("商品"+m.name +"售价为"+m.soldprice +"。请问购买几个");
                        int numToBuy = scanner .nextInt() ;

                        if(numToBuy >m.count ){
                                System.out.println("库存不足");
                        }
                        */
//第二件半价：numtobuy/2（全价的件数)，num%2(余一的全价)
/*
                        int fullPriceCount = numToBuy /2+numToBuy %2;
                        int halfPrice = numToBuy -fullPriceCount ;

                        double totalCost = fullPriceCount *m.soldprice +(halfPrice *m.soldprice /2);

                        m.count -=numToBuy ;

                        System.out.println("选购的商品总价为"+totalCost );
               }
*/

            /* System.out.println("请输入要购买的数量：");
                int count = scanner .nextInt();

                MerchandiseV2 m = littleSuperMarket .merchandises[count];
                System.out.println("用户选择的商品是超市里价值最高的："+m.isTheBiggestTotalValueOne(littleSuperMarket ) );
                double totalCost = m.buyAndPrintLeft(count,true);

                boolean m0BiggerThan = m0.totalValueBiggerTnan(m);
                System.out.println("m0的总价值比用户的选择要大："+m0BiggerThan );

                System.out.println("商品总价为："+totalCost );

              }

        }*/


//②
/*

                System.out.println("超市开门啦！");
                boolean open = true ;
                Scanner scanner = new Scanner(System.in ) ;
                while (open){
                        System.out.println("本店叫做"+littleSuperMarket .supermaketName);
                        System.out.println("本店地址"+littleSuperMarket .address );
                        System.out.println("共有停车位"+littleSuperMarket .parkingCount );
                        System.out.println("今天的营业额为"+littleSuperMarket .incomingSum );
                        System.out.println("共有商品"+littleSuperMarket .merchandises .length +"种");

                        Customer customer = new Customer() ;
                        customer .name = "顾客编号"+((int)(Math.random() *10000));
                        customer .money =(1+Math.random() )*1000;
                        customer .isDrivingCar = Math.random() >0.5;

                        if (customer .isDrivingCar ){
                                if (littleSuperMarket .parkingCount >0){
                                        System.out.println("欢迎"+customer .name +"驾车而来。本店已经为您安排了车位，停车免费");
                                        littleSuperMarket .parkingCount--;
                                }else{
                                        System.out.println("不好意思，本店车位已满，欢迎下次光临");
                                        continue;
                                }
                        }else {
                                System.out.println("欢迎"+customer .name +"光临本店");
                        }
                        double totalCost=0;

                        while (true){
                                System.out.println("本店提供"+all.length +"种商品，欢迎选购，请输入商品编号");
                                int index = scanner.nextInt();

                                if (index<0){
                                        break;
                                }

                                if (index>all.length ){
                                        System.out.println("本店没有这种商品，请叙述编号在"+(all .length -1)+"之内的商品编号。");
                                        continue;
                                }

                                MerchandiseV2  m = all[index];

                                System.out.println("选购的商品名字"+m.name +"。单价是"+m.soldprice +"。请问您要购买多少个？");
                                int numToBuy = scanner.nextInt();

                                if (numToBuy <0){
                                        System.out.println("不买看看也好，欢迎继续挑选。");
                                        continue;
                                }

                                if (numToBuy >m.count ){
                                        System.out.println("本店此商品库存没有那么多，欢迎继续选购。");
                                        continue;
                                }

                                if (numToBuy *m.soldprice+totalCost >customer .money ){
                                        System.out.println("您带的钱不够，欢迎继续挑选");
                                        continue;
                                }

                                 totalCost+= numToBuy *m.soldprice ;

                                m.count -=numToBuy ;
                                littleSuperMarket.merchandiseSold  [index]+=numToBuy ;
                        }

                        customer .money -=totalCost;

                        if (customer .isDrivingCar ){

                                System.out.println("顾客"+customer .name +"共消费了"+totalCost);

                                littleSuperMarket .incomingSum += totalCost;

                                System.out.println("还继续营业吗？");
                                open= scanner.nextBoolean();
                        }
                        System.out.println("超市关门了！");
                        System.out.println("今天的营业总额为"+littleSuperMarket .incomingSum +"。营业情况如下：");

                        for(int i = 0;i<littleSuperMarket .merchandiseSold .length ;i++){
                                MerchandiseV2   m = all[i];
                                int numSold = littleSuperMarket .merchandiseSold [i];
                                if (numSold >0){
                                        double incoming= m.soldprice  *numSold ;
                                        double netIncoming = (m.soldprice -m.purchasePrice )*numSold ;
                                        System.out.println(m.name +"售出了"+numSold +"个，销售额为"+incoming +"净利润为"+netIncoming );
                                }
                        }

                }
                System.out.println("下面请利润最高的商品自我介绍");

                littleSuperMarket .getBiggestProfitMerchandise() .describ() ;

        }
}
③
*/
