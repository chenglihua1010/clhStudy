package service.com.geekbang.supermaket;

//>>TODO  继承的语法就是在类后面使用extends 加 要继承的类名
//>>TODO 继承的类叫做父类（parent class），如MerchandiseV2
//>>TODO 继承者叫做子类（sub class），如PhoneExtendsMerchandise
//>>TODO JAVA中之允许一个类有一个直接的父类，即所谓的单继承
//>>TODO 别的类也可以继承子类，比如可以有一个HuaweiPhone继承PhoneExtendsMerchandiseV2
//>>TODO 这时候，HuaweiPhone就是PhoneExtnedsMerchandise的子类
//>>TODO 子类继承了父类的所有方法和属性
//>>TODO 但是子类并不能访问父类的private的成员（包括方法和属性）

//>>TODO 继承不是组合，继承也不只是为了能简单的拿来父类的属性和方法
//>>TODO 继承也不是通过组合的方式来实现的。和组合相比，继承更像“融合”
//>>TODO 所谓融合，即合二为一，可以相互影响？？？
import service.Screen;

public class PhoneExtendsMerchandise  extends MerchandiseV2 {
        //给Phone增加新的属性和方法
        private double screenSize;
        private double cpuHz;
        private int memoryG;
        private int storageG;
        private String brand ;
        private String os;

        public PhoneExtendsMerchandise (
                String name,String id,int count,double soldPrice,double purchasePrice,
                double screenSize ,double cpuHz ,int memory ,int storageG ,String  brand ,String os )
        {
                this.screenSize = screenSize;
                this.cpuHz = cpuHz ;
                this.memoryG =memory ;
                this.storageG =storageG ;
                this.brand =brand ;
                this.os = os ;

                this.setName(name );
                this.setId(id );
                this.setCount(count );
                this.setSoldPrice(soldPrice );
                this.setPurchasePrice(purchasePrice );
        }
        public void describePhone(){
                System.out.println("此手机商品属性如下");
                describe() ;
                System.out.println("手机厂商为"+brand +"，系统为"+os +"，硬件配置如下：\n"+
                                "屏幕"+screenSize +"寸\n"+
                                "cpu主频"+count +"Ghz\n"+
                                "内存"+memoryG +"Gb\n"+
                                "存储空间"+storageG +"Gb\n");
        }
        public boolean meetCondition(){
                return true;
        }

        public double getScreenSize() {
                return screenSize;
        }

        public void setScreenSize(double screenSize) {
                this.screenSize = screenSize;
        }

        public double getCpuHz() {
                return cpuHz;
        }

        public void setCpuHz(double cpuHz) {
                this.cpuHz = cpuHz;
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
}