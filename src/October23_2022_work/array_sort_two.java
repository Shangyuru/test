package October23_2022_work;

import java.util.Scanner;

public class array_sort_two {
    public static void main(String[] args) {
        //实例化数组1，并初始化十个元素(index=0~9)
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        //实例化数组2，用于放入用户输入后排序完成的序列(index=0~10)
        int[] arr2 = new int[11];
        //初始化用户输入对象
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.print("请输入一个数字:");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < num){
                arr2[i] = arr[i];
                index = i+1;
            }else {
                arr2[i+1] = arr[i];
            }
            arr2[index] = num;
        }
        System.out.print("排序后新数组中元素的值为:");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+"\t");
        }

    }
}
