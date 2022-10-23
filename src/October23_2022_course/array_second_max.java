package October23_2022_course;

public class array_second_max {
    public static void main(String[] args) {
        int[] arr = {15,9000,10000,-5,9500,20000};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值是:"+max);
    }
}
