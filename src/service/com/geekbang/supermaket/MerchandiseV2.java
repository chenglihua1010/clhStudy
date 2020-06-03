package service.com.geekbang.supermaket;

//>>TODO 类，静态方法，成员变量，构造方法，成员方法都可以使用访问修饰符
public class MerchandiseV2 {
/*        //>>TODO 成员变量应该都声明为private
        //>>TODO 如果要读写这些成员变量，最好使用get set 方法，这些方法应该是public
        //>>TODO 这样做的好处是，如果有需要，可以通过代码，检查每个属性是否合法
        private String name;
        private String id;
        private int count;
        private double soldprice;
        private double purchasePrice;

        //>>TODO 构造方法如果是private的，那么只有当前的类可以调用这个构造方法
        private MerchandiseV2 (String name, String id, int count, double soldprice,
                         double purchasePrice) {
                this.name = name;
                this.id = id;
                this.count = count;
                this.soldprice = soldprice;
                this.purchasePrice = purchasePrice;
        }
        //>>TODO 有些时候，会把所有的构造方法都定义成private的，然后使用静态方法调用构造方法？？？？
        //>>TODO 同样的，这样的好处可以通过代码检查每个属性是否合法
        public static MerchandiseV2 creatMerchandise (String name;String id ;int count;double soldprice;
                        double purchansePrice){
                if (soldprice<0 || purchansePrice <0){
                        return null;
                }
                return new MerchandiseV2(name,id,count,soldprice,purchanseprice);
        }*//*




        public String name;
        public String id;
        public int count;
        public double soldprice;
        public double purchasePrice;
//>>public 的方法类似一种约定，既然外面的代码可以使用，就意味着不能乱改，比如签名不能改之类的
        public void init(String name, String id, int count, double soldprice,
                         double purchasePrice) {
                this.name = name;
                this.id = id;
                this.count = count;
                this.soldprice = soldprice;
                this.purchasePrice = purchasePrice;
        }

        //>>TODO 访问修饰符
        //>>TODO 返回值类型，void（无需返回值类型）
        //>>TODO 方法名：任意合法的标识符均可
        //>>TODO 参数列表
        //>> TODO 方法体

        public void describ() {
                double neIncome = soldprice - purchasePrice;
                System.out.println("商品名字叫做" + name + "，id是" + id + "。商品售价是" + soldprice + "。商品进价是" +
                                purchasePrice + "。商品库存量是" + count + "。销售一个的毛利润是" + neIncome);
        }
        //>>TODO 在方法定义中指定方法的返回值类型--double
        //>>TODO  java中一个方法只能有一种返回值类型，如果不需要则用void 表示
        //>>TODO  如果定义了返回值，则必须使用return语句返回方法的返回值，return是Java的关键字
        //>>TODO 可以认为，返回值必须要能够用来给返回值类型的变量赋值

        public double calculatePorfit() {
                double profit = soldprice - purchasePrice;

                if (profit <= 0) {
                        return 0;
                        // return 语句必须是所在代码块的最后一个语句，类似break语句
                }
                return profit;
                //>>TODO 一个方法可以多个return语句
        }
        //>> TODO 参数是定义在方法名字后面的括号里的
        //>> TODO 参数定义的规范和变量一样，都是类型名字加标识符，这里的标识符我们叫做参数
        //>> TODO 方法体的代码可以使用参数
        //>> TODO 参数的值在调用方法的时候需要给出，有的资料叫做实参（实际参数）
        //>> TODO 对应的，方法定义这里的参数，叫做形参（形式参数）
        public double buy(int countToBuy){
                if (count <countToBuy ){
                        System.out.println("商品库存不够");
                        return-1;
                }
                //如果返回值是负数，代表购买失败
                System.out.println("商品单价为"+purchasePrice );
                int fullPriceCount = countToBuy /2+countToBuy %2;
                int halfPriceCount= countToBuy -fullPriceCount ;
                double totalCost = purchasePrice *fullPriceCount +halfPriceCount*purchasePrice /2;
                return totalCost ;
        }


        public double getCurrentCount() {
                return count;
        }

        public int getIntSoldPrice() {
                return (int) soldprice;
        }

        */
/*    public double buy(int countToBuy){
                    if (count<countToBuy ){
                            System.out.println("商品库存不够");
                            return -1;
                    }
                    System.out.println("商品单价为"+soldprice );

                    int fullPriceCount = countToBuy /2 +countToBuy %2;
                    int halfPriceCount = countToBuy - fullPriceCount ;
                    double totalCost = soldprice +fullPriceCount +halfPriceCount *soldprice /2;

                    count -=countToBuy ;

                    return totalCost ;
            }
            *//*

        public double buyAndPrintLeft(int countToBuy, boolean printLeft) {
                if (count < countToBuy) {
                        System.out.println("商品库存不够");
                        if (printLeft) {
                                System.out.println("商品剩余库存为" + count);
                        }
                        return -1;
                }

                System.out.println("商品单价为" + soldprice);

                int fullPriceCount = countToBuy / 2 + countToBuy % 2;
                int halfPriceCount = countToBuy - fullPriceCount;
                double totalCost = soldprice + fullPriceCount + halfPriceCount * soldprice / 2;

                count -= countToBuy;

                if (printLeft) {
                        System.out.println("剩余商品库存为" + count);
                }
                return totalCost;
        }
//>>TODO 参数可以是任何类型，包括自定义类型
        public boolean totalValueBiggerTnan(MerchandiseV2 merchandiseV2) {
                return count * purchasePrice > merchandiseV2.purchasePrice * merchandiseV2.count;
        }

        public boolean isTheBiggestTotalValueOne(LitterSuperMarket litterSuperMarket) {
                double totalValue = count * purchasePrice;
                for (int i = 0; i < litterSuperMarket.merchandises.length; i++) {
                        MerchandiseV2 m = litterSuperMarket.merchandises[i];
                        double newTotalValue = m.count * m.purchasePrice;
                        if (totalValue < newTotalValue) {
                                return false;

                        }
                }
                return true;
        }
        public void addCount (int count ){
                //>>TODO 方法里隐藏着一个this自引用，指向调用这个方法的对象
                //>>TODO 使用一个对象调用方法，也叫做在这个对象上调用方法。因为方法可以访问到这个对象的值
                //>>TODO 访问一个成员变量的完整形态，是“this.成员变量的名字“
                this.count = count ;
                System.out.println("Merchandise V2的addCount方法使用的对象是："+this );
        }


     */
/*   public double buyOne(){
                int  count = 1;
                if (this.count <count){
                        return -1;
                }
                this.count --;
                return count *soldprice ;
        }
        public double buyCount(int count){
                if (this.count <count ){
                        return -1;
                }
                this.count -=count;
                return count *soldprice ;
        }
        public double buyAsVip(int count ,boolean isVip){
                if (this.count <count ){
                        return -1;
                }
                this.count -=count ;
                double totalCost= count *soldprice ;
                if (isVip ){
                        return totalCost *0.95;
                }else {
                        return totalCost ;
                }
        }
        *//*


        */
/*public double buy() {
                return buy(1);
        }

        public double buy(int count) {
                return buy(count, false);
        }

        public double buy(int count, boolean isVIP) {
                if (this.count < count) {
                        return -1;
                }
                this.count -= count;
                double cost = count * soldprice;
                if (isVIP) {
                        return cost * 0.95;
                } else {
                        return cost;
                }
        }*//*

        public MerchandiseV2 gift;

        public double getSoldPrice() {
                return soldprice;
        }

        public String getName() {
                return name;
        }

        public MerchandiseV2 getGiftAndHowCanOutsideChangeIt() {
                return gift;
        }


        public void willOutsideValueChangeIfParameterValueChangeHereRef(MerchandiseV2 m2) {
                m2 = gift;
        }

        public void willOutsideValueChangeIfParameterValueChangeHerePrime(int intVal) {
                intVal = 99999999;
        }

        public void changeToTheSameGift(MerchandiseV2 m2) {
                m2.gift = gift;
        }
        // >> TODO 静态变量使用 static 修饰符
        public static double DISCOUNT_FOR_VIP = 0.95;

        // >> TODO 静态方法使用static修饰符。
        // 静态方法的方法名没有约定俗称全大写
        public static double getVIPDiscount() {
                // >> TODO 静态方法可以访问静态变量，包括自己类的静态变量和在访问控制符允许的别的类的静态变量
                return DISCOUNT_FOR_VIP;
        }

        // >> TODO 除了没有this，静态方法的定义和成员方法一样，也有方法名，返回值和参数
        // >> TODO 静态方法没有this自引用，它不属于某个实例，调用的时候也无需引用，直接用类名调用，所以它也不能直接访问成员变量
        // >> TODO 当然在静态方法里面，也可以自己创建对象，或者通过参数，获得对象的引用，进而调用方法和访问成员变量
        // >> TODO 静态方法只是没有this自引用的方法而已。
        public static double getDiscountOnDiscount(LitterSuperMarket littleSuperMarket) {
                double activityDiscount = littleSuperMarket.activityDiscount;
                return DISCOUNT_FOR_VIP * activityDiscount;
        }


}*/
        public String name;
        public String id;
        public int count;
        public double soldPrice;
        public double purchasePrice;

        public void addCount (int count ){
                //>>TODO 方法里隐藏着一个this自引用，指向调用这个方法的对象
                //>>TODO 使用一个对象调用方法，也叫做在这个对象上调用方法。因为方法可以访问到这个对象的值
                //>>TODO 访问一个成员变量的完整形态，是“this.成员变量的名字“
                this.count = count ;
                System.out.println("Merchandise V2的addCount方法使用的对象是："+this );
        }
        public MerchandiseV2 gift;


        public MerchandiseV2 getGiftAndHowCanOutsideChangeIt() {
                return gift;
        }


        public void willOutsideValueChangeIfParameterValueChangeHereRef(MerchandiseV2 m2) {
                m2 = gift;
        }

        public void willOutsideValueChangeIfParameterValueChangeHerePrime(int intVal) {
                intVal = 99999999;
        }

        public void changeToTheSameGift(MerchandiseV2 m2) {
                m2.gift = gift;
        }


        public boolean hasEnoughCountFor(int count) {
                System.out.println("MerchandiseV2的hasEnoughCountFor方法使用的对象是：" + this);

                return this.count >= count;
        }
        public double calculatePorfit() {
                double profit = soldPrice - purchasePrice;

                if (profit <= 0) {
                        return 0;
                        // return 语句必须是所在代码块的最后一个语句，类似break语句
                }
                return profit;

        }
        public MerchandiseV2(String name, String id, int count, double soldPrice, double purchansePrice) {
                this.name = name;
                this.id = id;
                this.count = count;
                this.soldPrice = soldPrice;
                this.purchasePrice = purchansePrice;

        }

        public MerchandiseV2() {
                this ("无名","000",0,1,1.1);


        }

//        public MerchandiseV2(String name, String id, int count, double soldPrice) {
//
//                this(name, id, count, soldPrice, soldPrice * 0.8);
//
//        }
//
//        public MerchandiseV2() {
//                this("无名", "000", 0, 1, 1.1);
//
//        }

        public void describe() {
                System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                                "。销售一个的毛利润是" + calculatePorfit() );
        }

        public double calculateProfit() {
                double profit = soldPrice - purchasePrice;
//        if(profit <= 0){
//            return 0;
//        }
                return profit;
        }

        public double buy(int count) {
                if (this.count < count) {
                        return -1;
                }
                this.count -= count;

                return count * soldPrice;
        }

        //TODO hashCode和equals是最常覆盖的两个方法
        //TODO 覆盖的原则是，equals为true，hasCode就应该相等
        //TODO 即equals为true是hasCode相等的充分非必要条件，hasCode相等时equals为true的必要不充分条件
//        @Override
//        public boolean equals(Object o) {
//                if (this == o) return true;
//                if (!(o instanceof MerchandiseV2)) return false;
//                MerchandiseV2 that = (MerchandiseV2 )  o ;
//                return this.getCount() ==that .getCount() &&
//                        Double.compare(that.getSoldPrice(), getSoldPrice()) == 0 &&
//                        Double.compare(that.getPurchasePrice(), getPurchasePrice()) == 0 &&
//                        getName().equals(that.getName()) &&
//                        getId().equals(that.getId());
//        }


        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof MerchandiseV2)) return false;

                MerchandiseV2 that = (MerchandiseV2) o;

                if (getCount() != that.getCount()) return false;
                if (Double.compare(that.getSoldPrice(), getSoldPrice()) != 0) return false;
                if (Double.compare(that.getPurchasePrice(), getPurchasePrice()) != 0) return false;
                if (!getName().equals(that.getName())) return false;
                return getId().equals(that.getId());

        }

        @Override
        public int hashCode() {
                int result;
                long temp;
                result = getName().hashCode();
                result = 31 * result + getId().hashCode();
                result = 31 * result + getCount();
                temp = Double.doubleToLongBits(getSoldPrice());
                result = 31 * result + (int) (temp ^ (temp >>> 32));
                temp = Double.doubleToLongBits(getPurchasePrice());
                result = 31 * result + (int) (temp ^ (temp >>> 32));
                return result;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public int getCount() {
                return count;
        }

        public void setCount(int count) {
                this.count = count;
        }

        public double getSoldPrice() {
                return soldPrice;
        }

        public void setSoldPrice(double soldPrice) {
                this.soldPrice = soldPrice;
        }

        public double getPurchasePrice() {
                return purchasePrice;
        }

        public void setPurchasePrice(double purchasePrice) {
                this.purchasePrice = purchasePrice;
        }

        public static void staticMethod(){
                System.out.println("staticMethod in MerchandiseV2");

        }

}
