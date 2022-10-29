package October23_2022_work;
/**
*@ClassName: array_one
*@Description:
*@Author: ShangYuru
*Date: 2022/10/26
*@Time: 20:22
*/
import java.util.Random;

public class array_one {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[6];     //新建能够容纳6个元素的数组
        Random random = new Random();       //实例化随机数对象random
        //利用循环将随机数放入数组
        for (int i = 0; i < 6; i++){
            arr[i] = random.nextInt(100);
            System.out.println("arr["+i+"]="+arr[i]);
        }
        //循环求和
        for (int i = 0; i < 6; i++){
            sum += sum(arr[i]);
        }
        System.out.println("随机生成的六个数之和为:" + sum);
    }
    //求和函数
    public static int sum(int num){
        int count = 0;
        count += num;
        return count;
    }
}
