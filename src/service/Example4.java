package service;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class Example4 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int rangeStar = 30;
                int rangeEnd = 55;
                int guessTotal = 10;

                int totalGameCount = 0;
                int corretGuessCount = 0;

                boolean gameEnd = false;

                while (!gameEnd) {
                        totalGameCount++;
                        int mod = rangeEnd - rangeStar;
                        if (mod <= 1) {
                                System.out.println("非法的数字范围：(" + rangeStar + "，" + rangeEnd + ")");
                        }

                        if (rangeStar < 0 || rangeEnd < 0) {
                                System.out.println("开始和结束必须是正数或者0");
                        }
                        int bigRandom = (int) (Math.random() * rangeEnd * 100);
                        int numberToGuess = (bigRandom % mod) + rangeStar;

                        if (numberToGuess <= rangeStar) {
                                numberToGuess = rangeStar + 1;
                        } else if (numberToGuess > rangeEnd) {
                                numberToGuess = rangeEnd - 1;
                        }
                        int leftToGuess = guessTotal;
                        boolean correntGameCounted = true;

                        System.out.println("请输入猜测的数字，范围在(" + rangeStar + "，" + rangeEnd + ")。输入-1代表结束游戏");

                        while (leftToGuess > 0) {
                                System.out.println("剩余猜测次数" + leftToGuess + "请输入本次猜测数字：");
                                int guess = in.nextInt();
                                if (guess < 0) {
                                        gameEnd = true;
                                        System.out.println("用户选择结束游戏。");
                                        break;
                                }
                                leftToGuess--;
                                if (guess > numberToGuess) {
                                        System.out.println("输出的数字比目标数字大");

                                } else if (guess < numberToGuess) {
                                        System.out.println("输出的数字比目标数字小");
                                } else {
                                        corretGuessCount++;
                                        correntGameCounted = true;
                                        System.out.println("输出的数字正确！");
                                        break;
                                }
                                if (!correntGameCounted) {
                                        totalGameCount++;
                                        correntGameCounted = true;
                                        System.out.println("本次的目标数字是：" + numberToGuess);
                                }

                        }
                        System.out.println("共进行了" + totalGameCount + "次游戏，其中猜中的次数为" + corretGuessCount);
                }
        }

}