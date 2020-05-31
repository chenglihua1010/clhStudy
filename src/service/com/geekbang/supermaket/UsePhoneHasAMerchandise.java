package service.com.geekbang.supermaket;

public class UsePhoneHasAMerchandise {
        public static void main(String[] args) {
                MerchandiseV2 merchandise = new MerchandiseV2(
                                "手机001","Phone001",100,1999,999) ;//多个gift变量
                PhoneHasMerchandise phone = new PhoneHasMerchandise(
                                4.5,3.5,4,44,"索尼","安卓",merchandise) ;
                phone.describePhone() ;
                //TODO 所有和商品相关的操作，我们先要从Phone里获得商品的引用，
                //TODO 然后通过这个引用 来操作商品
                phone .getMerchandise() .describe() ;
                //TODO 如果我们想要让手机返回不一样的商品名字，比如加上手机厂商
                //TODO 和型号，其实都可以做到，但是容易
                //TODO 我么可以在每次修改受即得厂商和型号的时候，都去set一下上的名字。繁琐，但是可以做到
                phone .getMerchandise() .getName() ;

                phone .getMerchandise() .buy(100);
        }
}