package service.com.geekbang.supermaket;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Date;

//TODO 接口的定义使用interface
//TODO 接口的方法，就是这个类型的规范，接口专注于规范，怎么实现这些规范，他不管
//TODO 接口无法被实例化，也就是不可new一个接口的实例



//TODO 有方法的接口，并不是多继承。接口不可以继承类
//TODO 同样，接口不可以声明实例变量。其方法是有限制的，比如这个接口，因为不能声明实例变量，
//TODO 只能通过getProducedDate和getExpireDate，间接通过实现接口的类，获取数据
//TODO 和抽象方法不同，如果一个类实现了两个接口，并且两个接口里有相同的缺省方法，编译器会报错
public interface  ExpireDateMerchandise {

        //TODO 接口里的方法都是public abstract修饰的，方法有名字，参数和返回值，没有方法体，以分号结束
        //TODO 接口注释最好写一下

        //TODO 缺省方法，也有this自引用,但是只能调用接口里的方法，或者继承接口里的方法
        //TODO 因为能new出实例来的，肯定是实现了所有方法，this自引用就是指向那个对象，所以使用起来不会有问题

        /**
         *截至到当前，商品的保质期天数是否超过传递的天数
         * @param days 截至到目前，保质期超过的天数
         * @return 截至到当前，，true如果保质期剩余天数比参数长，false如果保质期不到这么多天
         */
       // TODO 缺省的实现方法，用default修饰，可以有方法体
//        default boolean notExpireInDays(int days){
//                return daysBeforeExpie()>days;
//        }
          boolean notExpireInDays(int days);

        //TODO 因为接口里的方法都是且只能用public abstract修饰，所以这两修饰符可以省略
        //TODO abstrect就是抽象方法的修饰符，没有方法体，以分号结束

        /**
         *
         * @return 商品生产日期
         */
        Date getProduceDate();

        /**
         *
         * @return 商品生产日期
         */
        public abstract Date getExpireDate();

        /**
         *
         * @return 截至到当前，剩余保质期还剩下总保质期长度的百分比
         */
        double leftDatePercenttage();

        /**
         *  根据剩余的有效期的百分比，得出商品现在实际的价值
         * @param leftDatePercentage 剩余有效百分比
         * @return 剩余的实际价值
         */
        double actualValueNow(double leftDatePercentage);

        //TODO 接口中可以有私有方法，不需要用default修饰
        //TODO 接口里的私有方法可以认为是代码直接插入使用的地方

//        private long daysBeforeExpire(){
//                long expireMs = getExpireDate().getTime();
//                long left = expireMs-System.currentTimeMillis();
//                if(left<0){
//                        return -1;
//                }
//                //返回值是long,根据left的类型决定的
//                return left/(24*3600*1000);
//        }
//
//        private long dayAfterProduce() {
//                long produceMs = getProduceDate().getTime();
//                long past = produceMs - System.currentTimeMillis();
//                if (past < 0) {
//                        return -1;
//                }
//                return past / (24 * 3600 * 1000);
//        }
//        private long daysBeforeExpire(){
//                return daysBetween(System.currentTimeMillis(),getExpireDate().getTime());
//        }
//
//        private long daysAfterProduce(){
//                return daysBetween(getProduceDate().getTime(),System.currentTimeMillis());
//        }
//
//        //TODO 接口中可以有静态方法，不需要用default修饰。静态方法可以被实现接口的类继承
        public static long daysBetween(long from,long to){
                long gap=to-from;
                if (gap<0){
                        return -1;
                }
                return gap/(24*3600*1000);
        }
                default void testDuplicatedMethod(){

        }


        // TODO 接口里不能定义局部变量，定义的变量默认都是public static final的，这三个修饰符同样可以省略
        int VAL_IN_INTERFACE= 999;

}