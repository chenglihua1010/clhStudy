package service;

public class Example3 {
        public static void main(String[] args) {
                double randNum = 0;
                //要生成一个大于0.5的随机数，只有随机数大于0.5，循环才会退出
                while (randNum <0.5){
                        //使用Java中的Math.random()，生成一个随机数
                        randNum = Math.random() ;
                        System.out.println(randNum );
                }
                System.out.println("生成的大于0.5的随机数是"+randNum );

                int rangeStar = 30;
                int rangeEnd = 44;
                if(rangeStar <0|| rangeEnd <0){
                        System.out.println("开始和结束必须是正数或者0");
                }

                int mod = rangeEnd - rangeStar ;
                if (mod<=1){
                        System.out.println("非法的数字范围：("+rangeStar +"，"+rangeEnd +")");
                }
                for (int i = 0; i<10; i++) {
                        int bigRandom = (int)(Math.random() * rangeEnd * 100);
                        int numberToGuess = (bigRandom % mod) + rangeStar;
                        if (numberToGuess <=rangeStar ){
                                numberToGuess = rangeStar +1;
                        }else if (numberToGuess >rangeEnd ){
                                numberToGuess = rangeEnd -1;
                        }
                        System.out.println("mod=" + mod + "，numberToGuess=" + numberToGuess);
                }
        }

}