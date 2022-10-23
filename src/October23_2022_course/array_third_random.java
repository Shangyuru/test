package October23_2022_course;

import java.util.Random;
import java.util.Scanner;

public class array_third_random {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        Random index_random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int num = index_random.nextInt(arr.length);
            int other = arr[i];
            arr[i] = arr[num];
            arr[num] = other;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print("-->" + arr[i]);
        }
    }
}
