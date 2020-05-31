package service.com.geekbang.supermaket;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class LitterSuperMarket {
        public String supermaketName;
        public String address;
        public int parkingCount;
        public double incomingSum;
        public MerchandiseV2[] merchandises;
        public int[] merchandiseSold;
        public double activityDiscount;


        public void init(String supermaketName, String address, int parkingCount,
                         double incomingSum, int merchandiseCount, int count) {
                this.supermaketName = supermaketName;
                this.address = address;
                this.parkingCount = parkingCount;

                merchandises = new MerchandiseV2[merchandiseCount];
                for (int i = 0; i < merchandises.length; i++) {
                        MerchandiseV2 m = new MerchandiseV2();
                        m.name = "商品" + i;
                        m.count = count;
                        m.purchasePrice = Math.random() * 200;
                        m.soldPrice = m.purchasePrice * (1 + Math.random());
                        m.id = "ID" + i;
                        merchandises[i] = m;

                }
                merchandiseSold = new int[merchandises.length];
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









