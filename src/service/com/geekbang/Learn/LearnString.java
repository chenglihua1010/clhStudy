package service.com.geekbang.Learn;

public class LearnString {
        public static void main(String[] args) {
                String content = "01234567ABCDefgh";

                //String的length()是个方法不是属性，和数组的length不同？？？
                System.out.println(content .length() );

                //其实是生成一个新的Stirng对象（new）
                System.out.println(content.toUpperCase() );//改大写
                System.out.println(content.toLowerCase() );//该小写

                //content指向对象的内容并没有变化
                System.out.println(content );

                //索引从0开始
                System.out.println(content .charAt(1));//获取第二个字符

                System.out.println(content.substring(5));//从（）开始截取（第六个）

                System.out.println(content .substring(1,5));//截取第二个到第五个，不包含第五个

                String str = " abc";
                String str2 ="a b c ";
                String str3 = " a b c ";
                System.out.println(str);
                System.out.println(str.trim());//去掉开头的空格（.trim）
                System.out.println(str3 );
                System.out.println(str3.trim());

        }
}