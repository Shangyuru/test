package October23_2022_course;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("计算1~n的和，请输入n:");
        System.out.println("和为:"+getValue(scanner.nextInt()));
    }

    public static int getValue(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++){
            sum += i;
        }
        return sum;
    }
}
