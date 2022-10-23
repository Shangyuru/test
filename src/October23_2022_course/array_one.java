package October23_2022_course;

public class array_one {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {16,26,36,6,100};
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("销售总额是:"+sum);
    }
}
