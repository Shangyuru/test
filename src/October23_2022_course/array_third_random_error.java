package October23_2022_course;

//这是错误演示！

import java.util.Random;
import java.util.Scanner;

public class array_third_random_error {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        Random index_random = new Random();
        int num = index_random.nextInt(4)+1;
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++){
            int other;
            other = arr[j];
            arr[j] = arr[num];
            arr[num] = other;
            System.out.println(arr[j]);
        }
    }
}
