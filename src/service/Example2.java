package service;

public class Example2 {
        public static void main(String[] args) {
                int n = 3;

                String str = n + "对应的中文数字是：";
                if (n == 1) {
                        str += "壹";
                } else if (n == 2) {
                        str += "贰";
                } else if (n == 3) {
                        str += "叁";
                } else if (n == 4) {
                        str += "肆";
                } else {
                        System.out.println("错误的值 " + n + "。值需要大于1，小于等于4");
                }
                System.out.println(str);
        }
}