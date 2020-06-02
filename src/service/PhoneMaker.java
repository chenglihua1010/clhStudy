package service;

public class PhoneMaker {
        public static void main(String[] args) {
                Phone phone= new Phone("","",0,0,0,0,0,0,0,"","");

                phone .hasFigurePrintUnlocker =true;
                phone .price =1999;
                phone .screen =new Screen() ;

                phone .screen .producer = "京东方";
                phone .screen.size = 8.8;

               CPU cpu = new CPU();

                cpu.producer ="三星";
                cpu.speed = 3.5;

                Memory memory = new Memory() ;
                memory .producer = "三星";
                memory .capacity  = 4;

                Storage storage = new Storage() ;
                storage .producer ="intel";
                storage .capacity =128;

                phone.mainboard = new Mainboard() ;

                phone .mainboard .cpu = cpu;
                phone .mainboard .memory = memory ;
                phone .mainboard .storage =storage ;

                phone .mainboard .year= 2019;
                phone.mainboard .model = "EA888";

                phone.prephone =new Phone("","",0,0,0,0,0,0,0,"","") ;






        }

}