package service.com.geekbang.supermaket;

public class TestVizSamPkagAppMain {
        public static void main(String[] args) {
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场",
                                "世纪大道1号", 500, 600, 100);
                Phone ph = (Phone) superMarket.getMerchandiseOf(10);
//                System.out.println(ph.screenSize);
//                System.out.println(ph.memoryG);

                ShellColorChangePhone scp = (ShellColorChangePhone) superMarket.getMerchandiseOf(100);
//                System.out.println(scp.screenSize);
//                System.out.println(scp.memoryG);
        }
}