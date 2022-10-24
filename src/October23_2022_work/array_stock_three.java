package October23_2022_work;

public class array_stock_three {
    public static void main(String[] args) {
        double[] arr = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        int make_money = 0, lose_money = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) make_money++;
            else lose_money++;
        }
        System.out.println("赚钱的股票共:"+make_money+"只。");
        System.out.print("赚钱的股票共:"+lose_money+"只。");
    }
}
