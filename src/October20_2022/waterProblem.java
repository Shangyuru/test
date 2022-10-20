package October20_2022;

public class waterProblem {
    public static final int bucket_capacity = 10;            //水桶可容纳总量
    public static void main(String[] args){
        int bucket = 0;                 //目前水桶内总量
        int minute = 0;             //需要时间,同时也代表进水量
        int out_of_bucket =3;       //出水量
        while (bucket < bucket_capacity){
            minute++;
            bucket += minute - out_of_bucket;
            if (bucket < 0){
                bucket = 0;
            }
        }
        System.out.print("需要:" + minute + "分钟。");
    }
}
