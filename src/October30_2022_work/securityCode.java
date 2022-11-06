package October30_2022_work;

import java.util.Random;
import java.util.Scanner;

public class securityCode {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true){
                String code = getRandomCode();
                System.out.println("生成的验证码为:" + code);
                System.out.print("请输入验证码:");
                String input = scanner.next();
                if (!input.equalsIgnoreCase(code)){
                    System.out.println("输入错误,请重新输入...\n");
                }else {
                    System.out.println("输入正确!");
                    return;
                }
            }

        }

        public static String getRandomCode() {
            StringBuilder stringBuilder = new StringBuilder();
            for (char i = 'a'; i <= 'z'; i++) stringBuilder.append(i);
            for (char i = 'A'; i <= 'Z'; i++) stringBuilder.append(i);
            for (int i = 0; i <= 9; i++) stringBuilder.append(i);
            Random random = new Random();
            String code = "";
            for (int i = 0; i < 4; i++) {
                int index = random.nextInt(stringBuilder.length());
                code += stringBuilder.charAt(index);
            }
            return code;
        }
}
