package service;
//<<TODO  一个类以public class开头，public class代表这个类是公共类，类名必须和文件名相同
//<<TODO public class后面紧跟类名，然后是一对打括号的类体
public class MerchandiseUsingVariableExample {
        //<<TODO 类体中可以定义描述这个类的属性的变量。称之为成员变量（member variable）
        //<<TODO 每个成员变量的定义以;结束

        String name;
        String id;
        int count;
        double price;
        //<<TODO 上面着整个类，其实就是创建了一个模板，描述了一种我们需要的数据类型。






        public static void main(String[] args) {
                String m1Name = "茉莉花茶叶20包";
                String m1Id = "000099528";
                 int m1Count = 1000;
                double m1Price = 99.9;

                String m2Name = "可口可乐，330ml";
                String m2Id = "00009519";
                int m2Count = 1000;
                double m2Price = 3.0;

                int m1ToSlod = 1;
                System.out.println("感谢购买"+m1ToSlod +"个"+ m1Name +"。商品单价为"+
                                m1Price +"。消费总价为"+ m1Price *m1ToSlod +"。");
                m1Count -= m1ToSlod ;
                System.out.println(m1Id +"剩余的库存数量为"+m1Count );

                int m2ToSold = 3;
                System.out.println("感谢购买"+m1ToSlod +"个"+m2Name +"。商品单价为"+
                                m2Price +"。消费总价为"+m2Price *m2ToSold);
                m2Count -=m2ToSold  ;
                System.out.println(m2Id +"剩余的库存数量为"+m2Count );


        }

}