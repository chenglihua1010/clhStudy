package service.com.geekbang.supermaket;

public class Phone  extends MerchandiseV2 {
        private double screenSize;
        private double cpu;
        private static int memoryG;
        private int storageG;
        private String brand;
        private String os;
        private static int MAX_BUY_ONE_ORDER = 5;


        //TODO 静态内部类，是在类中使用static修饰的类
        //TODO 静态内部类，可以有访问控制符。静态内部类和静态方法，静态变量一样，都是类的静态组成部分
        //TODO 静态内部类也是类，在继承，实现接口方面都是一样的
        public static class CPU{
                private double speed;
                private String producer;

                public CPU(double speed,String producer){
                        this.speed=speed;
                        this.producer=producer;
                }

                public double getSpeed(){
                        //TODO 静态内部类，代码和这个类本身的访问权限一样，可以访问外部（Phone）的private属性
                        //TODO 这并不是说它可以访问private变量
                        //TODO 静态内部类是静态的，就好像静态方法一样，没有this引用，可以通过引用访问Phone对象的private属性
                        Phone phone=null;
                        Phone.memoryG=99;//???
                        return speed;
                }
                public void setSpeed(double speed){
                        this.speed=speed;
                }
                public String getProducer(){
                        return producer;
                }
                public void setProducer(){
                        this.producer=producer;
                }

                @Override
                public String toString() {
                        return "CPU{"+"speed"+speed+"，producer="+producer+"}";

                        }
                }
//        public void accessStaticClass(){
//              //  this.cpu.producer="";
//        }


        public Phone(
                        String name, String id, int count, double soldPrice, double purchasePrice,
                        double screenSize, double cpuHz, int memoryG, int storageG, String brand, String os
        ) {
                this.screenSize = screenSize;
                this.cpu = cpuHz;
               // this.cpu=new CPU(cpuHz,"Default");
                this.memoryG = memoryG;
                this.storageG = storageG;
                this.brand = brand;
                this.os = os;

                this.setName(name);
                this.setId(id);
                this.setCount(count);
                this.setSoldPrice(soldPrice);
                this.setPurchasePrice(purchasePrice);
        }

        //>>TODO 通过使用和父类方法签名一样，而且返回值也必须一样的方法，可以让子类覆盖掉（override）掉父类的方法
        //>>TODO 也就是说，子类并不是只能把父类的方法拿过来，而且可以通过覆盖来替换其中不适合子类的方法！！！
        //>>TODO 属性是联动的，可能是有特殊意义的？？
        //>>TODO 所以直接给属性赋值是危险的，因为没有办法检查新的值是否有意义，也没办法对这个修改做联动


        //TODO 使用super可以调用父类的方法和属性（必须满足访问控制符的控制）
        public double buy(int count) {
                //TODO 这个方法里代码大部分和父类一样，可定有办法解决
                if (count > MAX_BUY_ONE_ORDER) {
                        System.out.println("购买失败，手机最多只能买" + MAX_BUY_ONE_ORDER);
                        return -2;
                }
                return super.buy(count ) ;

  /*              if (this.count < count) {
                        System.out.println("购买失败，库存不够");
                        return -1;
                }
                this.count -= count;
                double cost = count * soldPrice;
                System.out.println("购买成功，花费为" + cost);
                return cost;*/

        }
        //TODO 返回值必须一样，不是类型兼容，而是必须一摸一样
        //TODO 如果签名一样，但是返回值不一样，会是错误的

     /*   public int buy(int count ){
                if (count >MAX_BUY_ONE_ORDER ){
                        return -2;
                }
                if (this .count <count ){
                        return -1;
                }
                return this.count -=count ;
        }
        public boolean  buy(int count){
                return true;
        }*/
        //TODO 覆盖可以覆盖掉父类的方法，同一个方法，不同的行为
        //TODO 这就是多态
        //TODO 方法可以覆盖，属性访问不可以，所以这也是使用方法的一个原因
        //TODO 即使在父类里，只是简单的getName,但是这样做，子类就可以覆盖掉父类的方法
        //TODO 方法不止眼前的代码，还有子类的覆盖。用方法，才能覆盖，多态
//        public String getName(){
//                return this.brand +":"+this.os +":"+name ;
//        }
        //TODO 根据我们对覆盖的理解，Phone类里的decribePhone方法应该叫作describe
        //TODO 同样的，我们可以调用父类的describe方法
//        public void describePhone(){
        public void describe(){
                System.out.println("此商品属性如下：");
                super.describe() ;
                System.out.println("手机厂商为："+brand +"；系统为"+os+"：硬件配置如下：\n"+
                                "屏幕：" + screenSize + "寸\n" +
                                "cpu主频" + cpu + " GHz\n" +
                                "内存" + memoryG + "Gb\n" +
                                "存储空间" + storageG + "Gb");
        }
        //TODO super是子类和父类交流的桥梁，但是并不是父类的引用
        //TODO 所以，super和this自引用不一样，不是简单可以模拟的
        public Phone getThisPhone (){
                return this ;
        }
        //TODO 使用super可以调用父类的public属性
        public void accessParentProps(){
                System.out.println("父类的name属性："+super .name );
        }

        public void useSuper(){
                //TODO super的用法就像是一个父类的引用。它是继承的一部分，但不是全部分
                super.describe() ;
                super .buy(22) ;
                System.out.println(""+super .count );
                System.out.println("赠品信息为：");
                gift.describe();
        }
        public MerchandiseV2 getGift() {
                return gift;
        }


        public double getScreenSize() {
                return screenSize;
        }

        public void setScreenSize(double screenSize) {
                this.screenSize = screenSize;
        }

        public double getCpuHz() {
                return cpu;
        }

        public void setCpuHz(double cpuHz) {
                this.cpu = cpuHz;
        }

        public int getMemoryG() {
                return memoryG;
        }

        public void setMemoryG(int memoryG) {
                this.memoryG = memoryG;
        }

        public int getStorageG() {
                return storageG;
        }

        public void setStorageG(int storageG) {
                this.storageG = storageG;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public String getOs() {
                return os;
        }

        public void setOs(String os) {
                this.os = os;
        }

        public boolean meetCondition(){
                return true;

        }

        public static void staticMethod(){
                System.out.println("staticMethod in ");

        }


}




