package October27_2022_course;

import java.util.Scanner;

public class StringDemo_three {
    public static void main(String[] args) {
        String corrUsername = "ShangYuru";
        String corrPassword = "20010919";
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i >= 0; i--){
            int num = 3;
            System.out.println("请输入用户名:");
            String UserName = scanner.next();
            System.out.println("请输入密码:");
            String UserPassword = scanner.next();
            if(corrUsername.equals(UserName) && corrPassword.equals(UserPassword)){
                System.out.println("进入系统");
            } else if (i == 0) {
                System.out.println("账户名或密码错误次数过多!请稍后重试!");
            } else {
                System.out.println("请重新输入，您还有"+i+"次机会.");
            }
        }
    }
}
