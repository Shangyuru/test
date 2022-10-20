package October20_2022;

import java.util.Scanner;

public class accessProblem {
    public static final double oneYear = 0.0225;        //1年利率
    public static final double twoYears = 0.027;        //2年利率
    public static final double threeYears = 0.0325;     //3年利率
    public static final double fiveYears = 0.036;       //5年利率
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入本金:");
        double capital = sc.nextDouble();       //本金
        System.out.print("请输入存取年限:");
        int years = sc.nextInt();               //存取年限
        switch (years){
            case 1: System.out.println(years+"年存取本息总额为:"+capital*(1+oneYear));break;
            case 2: System.out.println(years+"年存取本金总额为:"+capital*(1+twoYears));break;
            case 3: System.out.println(years+"年存取本金总额为:"+capital*(1+threeYears));break;
            case 5: System.out.println(years+"年存取本金总额为:"+capital*(1+fiveYears));break;
            default: System.out.print("没有您选择的套餐年限!请重新选择:");
        }
    }
}
