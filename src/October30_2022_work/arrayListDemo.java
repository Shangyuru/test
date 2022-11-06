package October30_2022_work;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringArrayList = new ArrayList<String>();
        for (int i = 1; ; i++){
            System.out.print("请输入你要存入的第"+i+"个元素:");
            stringArrayList.add(scanner.next());
            System.out.print("是否继续存入?是T,否F:");
            if (scanner.next().equalsIgnoreCase("F")){
                break;
            }
        }
        System.out.print("集合为:");
        for (int j = 0; j < stringArrayList.size(); j++){
            System.out.print(stringArrayList.get(j)+"  ");
        }

    }
}
