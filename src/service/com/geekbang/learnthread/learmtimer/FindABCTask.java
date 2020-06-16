package service.com.geekbang.learnthread.learmtimer;

import java.util.TimerTask;

public class FindABCTask extends TimerTask{
        //TODO 必须继承TimerTask才能被Timer schedule
        @Override
        public void run() {
                try{
                        String content=getWebContent();
                        if(content.contains("ABC")){
                                System.out.println("Find ABC in"+content);
                        }else{
                                System.out.println("ABC not found");
                        }
                }catch (Exception e){
                        e.printStackTrace();
                }
            //    throw new RuntimeException("not handle excetion");
        }

        private static String getWebContent(){
                StringBuilder ret=new StringBuilder();
                for(int i=0;i<4096;i++){
                        int rand=((int)(Math.random()*1000))%26;
                        char ch=(char)(rand+'a');
                        ret.append(ch);
                }
                return ret.toString();
        }
}