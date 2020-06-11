package service.com.geekbang.learngenrics.ext;

public class Grandparent {
        private int num;

        public Grandparent(int num){
                this.num=num;
        }

        public Grandparent(){
                this(-1);
        }

        public int getNum(){
                return num;
        }

        public void setNum(int num){
                this.num=num;
        }
}