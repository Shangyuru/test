package October_30_2022_course;
/**
*@ClassName: stringbuilderDemo
*@Description: StringBuilder类
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:22
*/
public class stringbuilderDemo {
    public static void main(String[] args) {
        //普通方法
        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println(a+b+c);
        //追加字符
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        System.out.println(stringBuilder);
        //字符串反转
        System.out.println(stringBuilder.reverse());
        //字符串长度
        System.out.println(stringBuilder.length());
        //转换为toSting
        System.out.println(stringBuilder.toString());
    }
}
