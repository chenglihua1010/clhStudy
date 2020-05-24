package service;


import java.util.Scanner;

public class Example6 {
        public static void main(String[] args) {
                int YuWenIndex =  0;
                int ShuXueIndex = 1;
                int WaiYuIndex = 2;
                int WuLiIndex = 3;
                int HuaXueIndex = 4;
                int ShengHuaIndex = 5;

                int totalScoreCount =6;

                String[]names =new String[totalScoreCount ];
                names[YuWenIndex ]="语文";
                names [ShengHuaIndex ]= "数学";
                names [WaiYuIndex ]= "外语";
                names [WuLiIndex ] = "物理";
                names [HuaXueIndex ]="化学";
                names [ShengHuaIndex ]="生化";

                Scanner scanner =new Scanner(System.in);
                System.out.println("请问共有多少年的成绩？" );
                int yearCount =scanner.nextInt();

                double[][] scores = new double[yearCount ][totalScoreCount  ];
                for (int i = 0;i <yearCount  ;i ++){
                        for (int j = 0;j<totalScoreCount ;j++){
                                scores [i][j] = 80+Math.random()*20;
                                System.out.println("第"+(i +1)+"年"+names[j]+"成绩为："+scores [i][j]);
                        }
                }
                boolean cont=true;
                while (true ){
                        System.out.println("请输入要进行的操作编号");
                        System.out.println("1：求某年最好成绩\n"+
                                     "2：求某年的平均成绩\n"+"3：求所有年份最好成绩\n"+
                                     "4：求某门课程历年最好成绩\n");
                        int oprtId = scanner.nextInt();

                        int year = 0;
                        switch(oprtId ){
                                case 1:
                                        // 让用户输入指定的年份
                                        System.out.println("请输入要计算第几年的最好成绩");
                                        year = scanner.nextInt();
                                        if (year <= 0 || yearCount < year) {
                                                System.out.println("非法的年份：" + year);
                                                cont = false;
                                                break;
                                        }
                                        year = year - 1;
                                        // 指定年份的最好成绩的编号，开始假设是0
                                        int bestOfYearScoreId = 0;
                                        // 循环指定年份的成绩，找出最好的成绩
                                        // TODO：如果有两门课的成绩一样，而且都是最高的，怎么办？
                                        for (int i = 1; i < totalScoreCount; i++) {
                                                if (scores[year][bestOfYearScoreId] < scores[year][i]) {
                                                        bestOfYearScoreId = i;
                                                }
                                        }
                                        System.out.println("第" + (year + 1) + "年成绩最好的科目为" + names[bestOfYearScoreId] + "，成绩为" + scores[year][bestOfYearScoreId] + "。");
                                        break;
                                case 2:
                                          System.out.println("请输入要求哪一年的平均成绩");
                                year = scanner.nextInt() -1;
                                if (year <0 || year>=yearCount ){
                                        System.out.println("非法的年份");
                                        break;
                                }
                                double totalScore = 0;
                                for (int i=0;i<scores[year ].length ;i++){
                                        totalScore +=scores [year ][i];
                                }
                                System.out.println("第"+(year +1)+"年的平均成绩为"+(totalScore /names.length ));
                                break;

                                case 4:
                                        System.out.println("请问要查询哪门课的历年最好成绩");
                                        int scoreId = scanner.nextInt()-1 ;
                                        year = 0;
                                        for (int i= 1;i<scores.length ;i++){
                                                if (scores [year ][scoreId ]<scores [i][scoreId ]){
                                                        year =i;
                                                }
                                        }
                                        System.out.println((names [scoreId ])+"历年最好成绩为第"+(year+1)
                                        +"年，成绩为："+scores [year ][scoreId ]);
                                        break;
                                default :
                                        System.out.println("程序结束。");
                                        cont = false;

                    }
                }
        }

}


