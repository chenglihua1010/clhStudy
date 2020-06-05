package service.com.geekbang.supermaket;

import java.util.Date;
//TODO 一个类只能继承一个父类（extends），但是可以实现多个接口()implements
//TODO 如果实现的接口里定义了一样的方法，那么也没问题。但是要求方法名，参数返回值类型都必须一摸一样

//TODO 实现有缺省方法的接口后，面对每个缺省的方法，一个类有三种选择
//TODO 1）默默继承，相当于把这部分代码，拷贝到当前类中
//TODO 2)重新声明此方法为abstract，相当于把这部分代码拒之门外，但是又abstract方法，也就是类必须是抽象的
//TODO 3)覆盖，重新实现

public  class  GamePointCard extends MerchandiseV2 implements ExpireDateMerchandise,ExpireDateMerchandiseDup{
        private Date produceDate;
        private Date expirationDate;

        public GamePointCard(String name, String id, int count, double soldPrice, double purchasePrice,
                             Date produceDate, Date expirationDate) {
                super(name, id, count, soldPrice, purchasePrice);
                this.produceDate=produceDate;
                this.expirationDate =expirationDate;
        }

        @Override
        public boolean notExpireInDays(int days) {
                return daysBeforeExpire()>days;
        }

        @Override
        public double leftDatePercenttage() {
                return 1.0*dayAfterProduce()/(daysBeforeExpire()+dayAfterProduce());
        }

        @Override
        public Date getProduceDate() {
                return produceDate;
        }

        @Override
        public Date getExpireDate() {
                return expirationDate;
        }

        @Override
        public double actualValueNow(double leftDatePercentage) {
                return super.getSoldPrice();
        }
        private long daysBeforeExpire(){
                long expireMs = expirationDate.getTime();
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