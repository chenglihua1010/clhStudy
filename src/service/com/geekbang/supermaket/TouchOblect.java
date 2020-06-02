package service.com.geekbang.supermaket;

public class TouchOblect {
        public static void main(String[] args) {
                Object obj = new Object() ;
                printObj(obj);
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100) ;
                printObj(superMarket );
                printObj(superMarket .getMerchandiseOf(0) );
                printObj(superMarket .getMerchandiseOf(10) );
                printObj(superMarket .getMerchandiseOf(100) );



        }
        public static void printObj (Object obj){
                System.out.println("-----"+obj+"的详细内容-----");
                System.out.println(obj );
                System.out.println(obj.toString() );
                System.out.println(obj.getClass() );
                System.out.println(obj.hashCode() );
        }


}