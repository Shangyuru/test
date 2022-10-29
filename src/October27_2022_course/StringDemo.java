package October27_2022_course;

import java.util.Random;

/**
*@ClassName: StringDemo
*@Description: 字符串练习
*@Author: ShangYuru
*@Date: 2022/10/27
*@Time: 20:19
*/

public class StringDemo {
    public static void main(String[] args) {
        Random random = new Random();
        String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("验证码为:");
        for (int i = 0; i < 5; i++){
            System.out.print(s.charAt(random.nextInt(0,62)));
        }
    }
}
