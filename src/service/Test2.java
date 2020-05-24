package service;

public class Test2 {


        //方法1
        public static void main(String[] args) {
                int yuanjia  = 100 ;//方法3、4入参赋值
                boolean hy = true;
                double zjjg;//方法1输出、方法3、4出参
                String name1="程历华";
                String name2="成历华";
                //方法2入参
                boolean shifouhuiyuan=shifouhy(name2);
                //if-else语句判断
                if(shifouhuiyuan==true){
                        zjjg=dazhe(yuanjia);
                }else {
                        zjjg=budazhe(yuanjia);
                }

                System.out.println(zjjg);

        }


        //方法2 会员判断
        public static boolean shifouhy(String name){
                if( "程历华".equals(name)){
                      return true;
                }else {
                        return false;
                }
        }


        //方法3 打折方法（if）
        public static double dazhe(int yuanjia) {
                double zhekou=0.5;
                double zkjg=yuanjia*zhekou;
                return zkjg;
        }

        //方法4  不打折方法(else)
        public static double budazhe(int yuanjia ) {
                double zhekou = 1;
                double wzkjg = yuanjia*zhekou;
                return wzkjg ;
        }

}