package service.com.geekbang.supermaket;

//TODO 使用enum而非class声明，继承ENUM类
public enum Category {

        // TODO 必须在开始的时候以这种形式，创建所有的枚举对象
        //TODO 不可重名
        FOOD(1),
        COOK(3),
        SNAKE(5),
        CLOTHES(7),
        ELECTRIC(9);

        private int id ;

        //TODO 构造方法必须使private的，不写也是private的
        private Category (int id ){
                this.id = id ;
        }
        public int getId(){return id;}


        @Override
        public String toString() {
                return "Category{"+"id = "+
                                id +"}";
        }
}