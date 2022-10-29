package October27_2022_course;

import java.util.Scanner;

/**
*@ClassName: StringDemo_two
*@Description:
*@Author: ShangYuru
*@Date: 2022/10/27
*@Time: 21:14
*/

public class StringDemo_two {
    public static void main(String[] args) {
        System.out.print("请输入你的电话号码:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("电话号码加密后为:"+s.substring(0,3)+"****"+s.substring(7,11));
    }
}
