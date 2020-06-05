package service.wwtest;

public class AppleClass {
        public  String color;
        public  String smell;
        public  String size;



        public AppleClass(){
                System.out.println("我是第一个苹果构造方法,空苹果");
        }

        public AppleClass(String color,String smell,String size){
                System.out.println("我是第二个苹果构造方法");
                this.color=color;
                this.smell=smell;
                this.size=size;
        }

        public AppleClass(String color,String smell){
                System.out.println("我是第三个苹果构造方法");
                this.color=color;
                this.smell=smell;
        }


        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }

        public String getSmell() {
                return smell;
        }

        public void setSmell(String smell) {
                this.smell = smell;
        }
}