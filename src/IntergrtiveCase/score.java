package IntergrtiveCase;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        double average = 0.0;
        int[] arr = new int[6];
        System.out.println("请输入6位评委的分数:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        quickSort(arr, 0, arr.length-1);
        for (int i = 1; i <= 4; i++){
            average += arr[i];
        }
        System.out.println("得分为:"+average/4);
    }

    public static void quickSort(int[] arr,int low,int high){
        int i, j, temp, t;
        if(low > high){
            return;
        }
        i = low;
        j = high;
        temp = arr[low];

        while (i < j) {
            while (temp <= arr[j] && i < j) j--;
            while (temp >= arr[i] && i < j) i++;
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }

}
