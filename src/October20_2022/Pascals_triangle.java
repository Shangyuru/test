package October20_2022;

import java.util.Scanner;

public class Pascals_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数：");
        int rows = sc.nextInt();        //定义行数与列数
        int[][] array = new int[rows][rows];
        //输出格式为正直角三角形
        for (int i = 0; i < rows; i++) {            //i:数字输出行数
            for (int j = 0; j < i + 1; j++) {       //j:数字输出列数
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        //更改输出格式为等边三角形（实际并不是什么等边三角形...）
        for (int k = 0 ; k < rows ; k++) {          //空格输出行数
            int num = rows - k;
            for (int p = 0; p < num + 5 ; p++) System.out.print("  ");      //改变第一列数字所在位置，数字前空格输出列数
            for (int q = 0 ; q < k + 1 ; q++) System.out.print(array[k][q] + "   ");      //两数间隔，及数字后空格输出列数
            System.out.println();
        }
    }
}