package service.com.geekbang.supermaket;

public class MerchandiseTest {
        //TODO  之前重载的时候，参数是用的自定义类型。
        public void testMerchandiseOverload(MerchandiseV2 me){
                System.out.println("参数为Phone的testMerchandiseOverload被调用了");
        }
        public void testMerchandiseOverload(Phone ph){
                System.out.println("参数为Phone的TestMerchandiseOverload被调用了");
        }
        public void testMerichandiseOverload(ShellColorChangePhone shellColorChangePhone ){
                System.out.println("参数为ShellColorChangePhone的TestMerchandiseOverload被调用了");

        }
        public void testMerchandiseOverload(String str) {
                System.out.println("参数为String的testMerchandiseOverload 被调用了");
        }

        public void testMerchandiseOverloadNotExactlyMatchType(MerchandiseV2 me) {
                System.out.println("参数为MerchandiseV2的testMerchandiseOverloadNotExactlyMatchType 被调用了");
        }

//    public void testMerchandiseOverloadNotExactlyMatchType(Phone ph) {
//        System.out.println("参数为Phone的testMerchandiseOverloadNotExactlyMatchType 被调用了");
//    }

        public void testMerchandiseOverloadNotExactlyMatchType(String str) {
                System.out.println("参数为String的testMerchandiseOverloadNotExactlyMatchType 被调用了");
        }
}