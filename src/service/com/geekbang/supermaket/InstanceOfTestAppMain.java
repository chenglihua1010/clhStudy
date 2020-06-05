package service.com.geekbang.supermaket;

public class InstanceOfTestAppMain {
        public static void main(String[] args) {
                int merchandiseCount = 60;
                LitterSuperMarket superMarket = new LitterSuperMarket("大卖场","世纪大道1号",500,merchandiseCount ,100) ;

                //TODO instance 操作符，可以判断一个引用指向对象是否是某一个类型给或者其子类
                //TODO 是则返回true，否则返回false
                for (int i =0 ; i <merchandiseCount ;i++){
                        MerchandiseV2 m = superMarket .getMerchandiseOf(i);
                        if (m instanceof Phone ){
                                Phone ph = (Phone ) m;
                                System.out.println(ph.getBrand() );
                        }
                }
                        MerchandiseV2 m= null ;//superMaiket.getMerchandiseOf(i);
                        if (m instanceof MerchandiseV2 ){
                                //TODO 先判断再强制类型转换，比较安全
                                MerchandiseV2 ph = (MerchandiseV2)m;
                                System.out.println(ph.getName() );
                        }else{
                                System.out.println("not an instance");
                        }
                }
                //TODO 如果引用是null，则返回false
        }
