package service.com.geekbang.supermaket;

import java.util.Date;

public class UseInterface {
        public static void main(String[] args) {

                Date produceDate = new Date() ;
                Date expireDate = new Date(produceDate .getTime()+365L*24*3600*1000);

                GamePointCard gamePointCard = new GamePointCard(
                                "手机001","Phone001",100,1999,999,
                                produceDate,expireDate
                );
                //phoneExtendsMerchandise.describe();


                //TODO 可以用实现接口的类的引用，给接口的引用赋值。类似于可以使用子类的引用给父类赋值
                ExpireDateMerchandise expireDateMerchandise = gamePointCard ;//接口指向对象，可以调用接口的方法
                //接口不可以实例化，接口指向的对象是一个实现了接口所有方法的类的实例
      //          VirtualMerchandise virtual = gamePointCard ;

                MerchandiseV2 m = gamePointCard ;//

                expireDateMerchandise = (ExpireDateMerchandise) m;//强制类型转换
     //           virtual = (VirtualMerchandise ) m;

                if (m instanceof ExpireDateMerchandise ){
                        System.out.println("m是ExpireDateMerchandise类型的实例");
                }

                if(m instanceof VirtualMerchandise ){
                        System.out.println("m是VirtualMerchandise类型的实例");
                }
                System.out.println(gamePointCard.notExpireInDays(366));

                System.out.println(gamePointCard.leftDatePercenttage());

                System.out.println(gamePointCard.actualValueNow(gamePointCard.leftDatePercenttage()));


        }
}