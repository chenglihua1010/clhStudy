package service.com.geekbang.supermaket;

import java.util.Date;

//TODO 抽象类用abstract修饰，抽象类可以继承别的类的或者抽象类，也可以实现接口
//TODO 抽象类可以有抽象方法，抽象方法可以来自实现的接口，也可以自己定义
//TODO 抽象类不可以被实例化
//TODO 抽象类也可以没有抽象方法，没有抽象方法的抽象类也不可以被实例化
//TODO 抽象类有两点特殊：被abstract修饰，可以有抽象方法；不可以被实例化
public abstract class AbstractExpireDateMerchandise extends MerchandiseV2 implements ExpireDateMerchandise {
        private Date produceDate;
        private Date expireDate;

        //TODO 抽象类构造方法的语法和类一样
        public AbstractExpireDateMerchandise(String name, String id, int count, double soldPrice,
                                             double purchasePrice, Date produceDate, Date exprireDate){
                super(name,id,count,soldPrice,purchasePrice);
                this.produceDate =produceDate;
        this.expireDate =exprireDate;
}


        public AbstractExpireDateMerchandise(String name, String id, int count, double soldPrice,
                                             Date produceDate, Date exprireDate){
                super(name,id,count,soldPrice);
                this.produceDate =produceDate ;
                this.expireDate =exprireDate ;
        }

        public AbstractExpireDateMerchandise(Date produceDate, Date exprireDate){
                this.produceDate=produceDate;
                this.expireDate =exprireDate;
        }

        //TODO @是Java种的注解（annotation）
        //TODO 覆盖父类的方法/实现了继承的接口的方法
        @Override
        public boolean notExpireInDays(int days) {
                return daysBeforeExpire()>0;
        }

        @Override
        public Date getProduceDate() {
                return produceDate;
        }

        @Override
        public Date getExpireDate() {
                return expireDate;
        }

        @Override
        public double leftDatePercenttage() {
                return 1.0*daysBeforeExpire() /(daysBeforeExpire()+dayAfterProduce());
        }


        //TODO 这两个方法是私有的，返回值改成int，也没有顾忌

        private long daysBeforeExpire(){
                long expireMs = expireDate.getTime();
                long left = expireMs-System.currentTimeMillis();
                if(left<0){
                        return -1;
                }
                //返回值是long,根据left的类型决定的
                return left/(24*3600*1000);
        }

        private long dayAfterProduce() {
                long produceMs = produceDate.getTime();
                long past = produceMs - System.currentTimeMillis();
                if (past < 0) {
                        return -1;
                }
                return past / (24 * 3600 * 1000);
        }
}