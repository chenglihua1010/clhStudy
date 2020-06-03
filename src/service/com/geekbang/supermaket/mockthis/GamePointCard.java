package service.com.geekbang.supermaket.mockthis;

import service.com.geekbang.supermaket.ExpireDateMerchandise;
import service.com.geekbang.supermaket.MerchandiseV2;
import service.com.geekbang.supermaket.VirtualMerchandise;

import java.util.Date;

//TODO 一个类只能继承一个父类，但是可以实现多个接口
//TODO 如果实现的借楼里定义了一样的方法，那么也没问题。但是要求方法名，参数返回值类型都必须一摸一样
public  class  GamePointCard extends MerchandiseV2 implements ExpireDateMerchandise ,
                VirtualMerchandise {
        private Date produceDate;
        private Date expirationDate;

        public  GamePointCard(String name, String id,int count, double soldPrice, double purchasePrice,
                             Date produceDate, Date expirationDate){



        super(name,id,count,soldPrice,purchasePrice);
        this.produceDate = produceDate;
        this.expirationDate  = expirationDate ;


        }

        @Override
        public boolean notExpireInDays(int days) {
                return daysBeforeExpire()>days;
        }

        @Override
        public Date getProduceDate() {
                return produceDate ;

        }

        @Override
        public Date getExpireDate() {
                return expirationDate ;

        }

        @Override
        public double leftDatePercenttage() {
                return 1.0*daysBeforeExpire()/(daysBeforeExpire() + daysAfterProduce());

        }

        @Override
        public double actualValueNow(double leftDatePercentage) {
                return soldPrice ;

        }
        public long daysBeforeExpire (){
                long expirMs = expirationDate .getTime() ;
                long left = expirMs - System.currentTimeMillis() ;
                if (left <0 ){
                        return -1;
                }
                return left /(24*3600*1000);
        }

        public long daysAfterProduce (){
                long expirMs = expirationDate .getTime() ;
                long left = expirMs - System.currentTimeMillis() ;
                if (left <0 ){
                        return -1;
                }
                return left /(24*3600*1000);
        }

}