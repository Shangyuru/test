package October20_2022;

public class tradeIn {
    public static final double discount = 0.8;
    public static void main(String[] args){
        int phone_price = 7988;
        int sell = 1500;
        if (phone_price * 0.8 < phone_price - sell){
            System.out.println("以旧换新");
        }else System.out.println("二手转卖");
    }
}
