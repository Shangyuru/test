package October23_2022_work;

import java.util.Scanner;

public class array_side_four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你要创建的数组大小:");
        int i = scanner.nextInt();
        int[] arr = new int[i];
        for (int n = 0; n < i; n++){
            arr[n] = scanner.nextInt();
        }
        divide(arr);
        sort(arr);
        out(arr);
    }
    public static void divide(int[] num){
        //i正数,j倒数
        int plus = 0, minus = num.length - 1;
        while (plus < minus){
            //全偶
            while (num[plus] % 2 == 0 && num[minus] % 2 == 0 && plus < minus) plus++;
            //全奇
            while (num[plus] % 2 != 0 && num[minus] % 2 != 0 && plus < minus) minus--;
            //左奇右偶
            while (num[plus] % 2 != 0 && num[minus] % 2 == 0 && plus < minus){
                int temp = num[plus];
                num[plus] = num[minus];
                num[minus] = temp;
            }
            //左偶右奇
            while (num[plus] % 2 == 0 && num[minus] % 2 != 0 && plus < minus){
                plus++;
                minus--;
            }
        }
    }

    public static void sort(int[] arr){
        int i = 0, count = 0;
        while (arr[i] % 2 == 0){
            count += 1;
            i++;
        }
        for (i = 1; i < count; i++){
            for (int j = 0; (j < i) && (i < count); j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = count - 1; i < arr.length; i++){
            for (int j = count; j < i; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void out(int[] num){
        for (int i = 0; i < num.length; i++){
            System.out.print("\t"+num[i]);
        }
    }
}
