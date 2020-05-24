package service;

//类
public  class HelloWorld {
        //变量abcd
        private String a;
        public String b;
        protected int c;
         float d;


        //有参构建方法
        public  HelloWorld(String a, String b, int c, float d) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
        }

        //无参构造方法
        public HelloWorld() {
        }

        //方法main
        public static void main(String [] args ){
                System.out.println("我是蔡徐坤");
                System.out.println("我要开始了");
                System.out.println(say());
                System.out.println(tiao());
                System.out.println(chang());
                System.out.println(lanqiu());


        }

        public static String say(){
                return "我会说话";
        }

        public static String tiao(){
                return "我会跳舞";
        }

        public static String chang(){
                return "我会唱歌";
        }

         public static String lanqiu(){
                        return "我会打篮球";
                }




}