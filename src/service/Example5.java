package service;

import java.util.Scanner;

public class Example5 {
                public static void main(String[] args) {
                        int YuWenIndex =  0;
                        int ShuXueIndex = 1;
                        int WaiYuIndex = 2;
                        int WuLiIndex = 3;
                        int HuaXueIndex = 4;
                        int ShengHuaIndex = 5;

                        String[]names=new String[6];
                        names[YuWenIndex ]="语文";
                        names [ShengHuaIndex ]= "数学";
                        names [WaiYuIndex ]= "外语";
                        names [WuLiIndex ] = "物理";
                        names [HuaXueIndex ]="化学";
                        names [ShengHuaIndex ]="生化";

                        Scanner in=new Scanner(System.in);
                        System.out.println("请问要保存几年的成绩？" );
                        int yearToStore=in.nextInt();
                        double[][] scores = new double[yearToStore ][names.length ];
                        for (int i = 0;i <yearToStore ;i ++){
                                for (int j = 0;j<names.length ;j++){
                                        scores [i][j] = 80+Math.random()*20;
                                }
                        }
                        System.out.println("请问你要查看第几年的成绩？" );

                        int year = in.nextInt()-1;
                        System.out.println("请问要查看的课程编号");
                        int scoresIndex = in.nextInt()-1;
                        System.out.println("第"+(year +1)+"年的"+names[scoresIndex]+
                                        "成绩是："+scores [year ][scoresIndex ]);

                }

}