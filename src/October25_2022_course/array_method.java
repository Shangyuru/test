package October25_2022_course;
/**
*@ClassName: array_method
*@Description:
*@Author: ShangYuru
*@Date: 2022/10/26
*@Time: 20:27
*/
import java.util.Scanner;

public class array_method {

    public static void main(String[] args) {
        System.out.print("请输入你要查询的值:");
        Scanner scanner = new Scanner(System.in);
        int[] arr = {11,22,33,44,55};
        int num = scanner.nextInt();
        System.out.print("他的索引为:"+method(arr,num));
    }

    public static int method(int[] arr,int num){
        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
