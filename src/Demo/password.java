package Demo;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        int password = 520;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码:");
        int in = sc.nextInt();
        while(in != password){
            System.out.println("密码不正确！请输入密码:");
            in = sc.nextInt();
        }
        System.out.println("密码正确!");
    }
}
