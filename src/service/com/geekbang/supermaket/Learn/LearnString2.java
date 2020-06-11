package service.com.geekbang.supermaket.Learn;

public class LearnString2 {
        public static void main(String[] args) {
                String content = "Orange_Apple_Banana";

                char [] chars = content .toCharArray() ;//字符串分割成单个字符
                for (int i = 0;i<chars .length ;i++){
                        System.out.println(chars [i]);
                }
                String sp= "_";
                String [] s = content .split( sp);
//                String [] s = content .split( regex:"_") ;
                for(int i = 0;i<s.length ;i++){
                        System.out.println(s [i]);
                }//以"_"为准，将字符串分为多个数组

                int indexOf = content .indexOf('_');//‘_’第一次出现在字符串中的索引
                System.out.println(indexOf );
                System.out.println(content .substring(indexOf +1,content .length() ));//输出从（）的索引范围的字符

                String str = "_";
                int lastIndexOf = content .lastIndexOf(sp);//从最后后开始，‘_’第一次出现在字符串中的索引
                System.out.println(lastIndexOf );
                System.out.println(content .substring(0,lastIndexOf ) );

                System.out.println(content.contains("Apple") );//比较字符中是否有("")的存在
                System.out.println(content .contains("apple") );
                System.out.println(content .startsWith("Orange") );//是否以”Orange“开始
                System.out.println(content.endsWith("Banana") );//是否以”Banana“结束

                String content2 = "Orange_Apple_Banana";
                String content3 = "orange_Apple_banana";

                //>>TODO 两个String对象比较是否相等，一定要用equals方法
                System.out.println(content.equals(content2 ) );//比较字符是否一样

                System.out.println(content.equals(content3 ) );

                System.out.println(content .equalsIgnoreCase(content3 ) );//比较字符（不区分大小写）


        }
}