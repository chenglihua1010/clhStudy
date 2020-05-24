package service;

public class IfElseSwitch {
        public static void main(String[] args) {
                int n = 2;
                String str = n + "对应的汉字:";

                switch (n) {
                        case 1 :
                                str += "壹";
                                break;
                        case 2:
                                str +="贰";
                                break;
                        case 3:
                                str +="叁";
                                break;
                        case  4:
                                str += "肆";
                                break;
                        case 5:
                                str += "伍";
                                break;
                        default :
                                System.out.println("错误的值"+ n+"。值需大于1，小于等于5。");
                }
                System.out.println(str);
        }
}