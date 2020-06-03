package service.com.geekbang.supermaket;

import java.util.Date;

public class TestInterface implements ExpireDateMerchandise ,VirtualMerchandise {
        @Override
        public boolean notExpireInDays(int days) {
                return false;
        }

        @Override
        public Date getProduceDate() {
                return null;
        }

        @Override
        public Date getExpireDate() {
                return null;
        }

        @Override
        public double leftDatePercenttage() {
                return 0;
        }

        @Override
        public double actualValueNow(double leftDatePercentage) {
                return 0;
        }
//        public boolean notExpireInDays(int day){
//                return false ;
//        }
//        public Date getProducedDate(){
//                return null;
//        }
//        public Date getExpireDate (){
//                return null;
//        }
//        public double leftDatePercentage(){
//                return 0;
//        }
//        public double actualValueNow(double leftDatePercentage){
//                return 0 ;
//        }
}