package October27_2022_course;

import java.util.ArrayList;
import java.util.Scanner;

/**
*@ClassName: ArrayListDemo1
*@Description: 用ArrayList遍历并删除元素值
*@Author: ShangYuru
*@Date: 2022/10/28
*@Time: 15:17
*/

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩序列数目:");
        int count = 1,input_num = scanner.nextInt();
        boolean charge = true;
        if (input_num > 0){
            while (count <= input_num && count > 0){
                System.out.print("请输入第"+count+"个值:");
                arrayList.add(scanner.nextInt());
                count++;
            }
        }else {
            System.out.println("\n你输入的成绩数目出错！");
            return;
        }
        System.out.print("成绩大于80分的序列为:");
        for (int i = arrayList.size()-1; i >= 0; i--){
            if (arrayList.get(i) < 80) {
                arrayList.remove(arrayList.get(i));
            }else System.out.print("  "+arrayList.get(i));
        }
        System.out.println("\n序列长度为:"+arrayList.size());
        System.out.println("序列内元素为:");
        for (int j = 0; j < arrayList.size(); j++){
            System.out.print("  "+arrayList.get(j));
        }
    }
}
