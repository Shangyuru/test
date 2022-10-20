package October20_2022;

import java.util.Scanner;

public class revenue {
    public static final int threshold = 5000;       //起征点
    public static final int gradient1 = 3000;       //梯度一
    public static final int gradient2 = 12000;      //梯度二
    public static final int gradient3 = 25000;      //梯度三
    public static final int gradient4 = 35000;      //梯度四
    public static final int gradient5 = 55000;      //梯度五
    public static final int gradient6 = 80000;      //梯度六
    public static final double Percentage_of_three_insurances = 0.1;        //三险一金百分比
    public static final double Percentage_of_tax1 = 0.03;       //税收百分比1
    public static final double Percentage_of_tax2 = 0.1;        //税收百分比2
    public static final double Percentage_of_tax3 = 0.2;        //税收百分比3
    public static final double Percentage_of_tax4 = 0.25;       //税收百分比4
    public static final double Percentage_of_tax5 = 0.3;        //税收百分比5
    public static final double Percentage_of_tax6 = 0.35;       //税收百分比6
    public static final double Percentage_of_tax7 = 0.45;       //税收百分比7
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入税前工资:");
        int price = sc.nextInt();       //本金
        double three_insurances = price * Percentage_of_three_insurances;       //三险一金应扣金额
        System.out.println("三险一金金额为:"+three_insurances);
        double overfull = price - three_insurances - threshold;         //交税溢出部分
        if(overfull + threshold < threshold){
            System.out.print("交税0元!");
        } else if (overfull >= 0 && overfull < gradient1) {
            System.out.print("你需要交税:"+overfull * Percentage_of_tax1 + "元。");
        } else if (overfull >= gradient1 && overfull < gradient2) {
            System.out.print("你需要交税:"+overfull * Percentage_of_tax2 + "元。");
        } else if (overfull >= gradient2 && overfull < gradient3) {
            System.out.print("你需要交税:"+overfull * Percentage_of_tax3 + "元。");
        } else if (overfull >= gradient3 && overfull < gradient4) {
            System.out.print("你需要交税:"+overfull * Percentage_of_tax4 + "元。");
        } else if (overfull >= gradient4 && overfull < gradient5) {
            System.out.print("你需要交税:"+overfull * Percentage_of_tax5 + "元。");
        } else if (overfull >= gradient5 && overfull < gradient6) {
            System.out.print("你需要交税:"+overfull * Percentage_of_tax6 + "元。");
        } else System.out.print("你需要交税:"+overfull * Percentage_of_tax7 + "元。");
    }
}
