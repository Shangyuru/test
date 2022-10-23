package October23_2022_course;

import java.util.Random;
import java.util.Scanner;

public class array_forth_guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int i;
        for (i = 0 ; i < 5 ; i++) arr[i] = random.nextInt(21);
        while (true)
        {
            for (i = 0 ; i < arr.length ;i++)
            {
                if(scanner.nextInt() == arr[i])
                {
                    System.out.println("运气不错，猜中了");
                    System.out.println(i+1);
                    for (i = 0 ;i <arr.length;i++) System.out.print(arr[i]+"\t");
                    return;
                }else System.out.println("未猜中");
            }
        }
    }

}
