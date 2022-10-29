package October25_2022_course;
/**
*@ClassName: arrayCharge
*@Description:
*@Author: ShangYuru
*@Date: 2022/10/26
*@Time: 20:27
*/
public class arrayCharge {
    public static void main(String[] args) {
        int[] arr_one = {10,20,30};
        int[] arr_two = {10,20,30};
        System.out.println(method(arr_one,arr_two));
    }
    public static boolean method(int[] arr1, int[] arr2){
        boolean result = false;
        if(arr1.length != arr2.length){
            return result;
        }
        else{
            for (int pos = 0; pos < arr1.length; pos ++){
                if(arr1[pos] !=arr2[pos])
                {
                    result = false;
                    break;
                }
                else result = true;
            }
        }
        return result;
    }
}
