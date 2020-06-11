package service.com.geekbang.learngenrics.define;

//TODO 定义泛型，就是把需要的类型定义在类后面的尖括号里，
//todo 然后再类里面就可以把定义好的泛型像符号一样使用
public class MyGenericClass<First,Second> {
        //todo 实际上这两个引用都是object类型的
        private First first;
        private Second second;

        public MyGenericClass(First first,Second second){
                this.first=first;
                this.second=second;
        }

        public First getFirst() {
                return first;
        }

        public void setFirst(First first) {
                this.first = first;
        }

        public Second getSecond() {
                return second;
        }

        public void setSecond(Second second) {
                this.second = second;
        }
//      强制类型转换
        public <Another>Another getAnother(Object val){
                return (Another)val;
        }
}