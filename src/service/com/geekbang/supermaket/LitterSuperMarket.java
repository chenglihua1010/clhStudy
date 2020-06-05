package service.com.geekbang.supermaket;

public class LitterSuperMarket {
        public String supermaketName;
        public String address;
        public int parkingCount;
        public double incomingSum;
        public MerchandiseV2[] merchandises;
        public int[] merchandiseSold;
        public double activityDiscount;


        public LitterSuperMarket (String supermaketName, String address, int parkingCount,
                        int merchandiseCount, int count) {
                this.supermaketName = supermaketName;
                this.address = address;
                this.parkingCount = parkingCount;

                merchandises = new MerchandiseV2[merchandiseCount];
                for (int i = 0; i < merchandises.length; i++) {
                        MerchandiseV2 m = null;
                        if (i > 0 & i % 100 == 0) {
                                m = new ShellColorChangePhone(
                                                "商品" + i,
                                                "ID" + i,
                                                count,
                                                1999,
                                                999,
                                                4.5,
                                                3.5,
                                                4,
                                                128,
                                                "三星",
                                                "Android"
                                );
                        } else if (i > 0 & i % 10 == 0) {
                                m = new Phone(
                                                "商品" + i,
                                                "ID" + i,
                                                count,
                                                1999,
                                                999,
                                                4.5,
                                                3.5,
                                                4,
                                                128,
                                                "索尼",
                                                "Android"
                                );
                        } else {
                                double purchasePrice = Math.random() * 200;
                                m = new MerchandiseV2(
                                                "商品" + i,
                                                "ID" + i,
                                                count,
                                                purchasePrice * (1 + Math.random()),
                                                purchasePrice
                                );
                        }
                        // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
                        merchandises[i] = m;
                }
                merchandiseSold = new int[merchandises.length];
        }

        public boolean findMerchandise(MerchandiseV2 target){
                int i = 0 ;
                for (MerchandiseV2 m:merchandises){
                        boolean match =m.equals(target);
                        if (match){
                                System.out.println("找到商品，位置在"+i);
                                return true ;
                        }
                        i++;
                }
                return false ;
        }
        //TODO 只循环遍历，不赋值，不跳跃访问，不需要知道当前元素第几个
        public double  getBiggestPurchasePrice(){
                double maxPurchasePrice= -1;

                for (MerchandiseV2 m:merchandises ){
                        if (m.getPurchasePrice() >maxPurchasePrice ) {
                                maxPurchasePrice = m.getPurchasePrice() ;

                        }
                }
                return maxPurchasePrice ;


        }



        public String getSupermaketName() {
                return supermaketName;
        }

        public String getAddress() {
                return address;
        }

        public int getParkingCount() {
                return parkingCount;
        }

        public double getIncomingSum() {
                return incomingSum;
        }

        public void setSuperMarketName(String supermaketName) {
                this.supermaketName = supermaketName;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public void setParkingCount(int parkingCount) {
                this.parkingCount = parkingCount;
        }

        public void setIncomingSum(double incomingSum) {
                this.incomingSum = incomingSum;
        }

        public void setMerchandise(int[] merchandise) {
                this.merchandises = merchandises;
        }

        public void setMerchandiseSold(int[] merchandiseSold) {
                this.merchandiseSold = merchandiseSold;
        }

// 返回值类型可以是类名（merchandiseV2）,这时候说明实际返回的值就是这个类的引用
        // 求最大利润方法一
        public MerchandiseV2 getBiggestProfitMerchandise() {
                MerchandiseV2 curr = null;
                for (int i = 0; i < merchandises.length; i++) {
                        MerchandiseV2 m = merchandises[i];
                        if (curr == null) {
                                curr = m;
                                continue;
                        }
// 调用商品中定义的方法，不同的实例调用相同的方法，虽然代码相同，但是每个实例内部数据不同，返回值也不同
                        double currProfit = curr.calculatePorfit();
                        double newProfit = m.calculatePorfit();
                        if (currProfit < newProfit) {
                                curr = m;
                        }
                }
                return curr;
                //最大利润方法一
        }
//求最大利润方法二
        public MerchandiseV2 getBiggestMerchandise2() {
                MerchandiseV2 curr = null;
                for (int i = 0; i < merchandises.length; i++) {
                        MerchandiseV2 m = merchandises[i];
                        if (curr == null) {
                                curr = m;
                        } else {
                                if (curr.calculatePorfit() < m.calculatePorfit()) {
                                        curr = m;
                                }
                        }
                }
                return curr;
        }
        //最大利润方法二，直接调用方法（curr/m.calculatePorfit）



        public MerchandiseV2 getMerchandiseOf(int merchandiseIndex) {
                if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
                        return null;
                }
                return merchandises[merchandiseIndex];
        }


        public void addIncomingSum(double toBeAdded) {
                this.incomingSum += toBeAdded;
        }


        public boolean spendMoney(double toBeSpent) {
                if (toBeSpent > incomingSum) {
                        return false;
                }
                incomingSum -= toBeSpent;
                return true;
        }

}









