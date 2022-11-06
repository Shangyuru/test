package November2_2022_course;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
*@ClassName: arrayDemo
*@Description: 数组类
*@Author: ShangYuru
*@Date: 2022/11/2
*@Time: 21:14
*/
public class arrayDemo {
    public static void main(String[] args) {
        //数组转Sting
        Integer[] array = {6,1,2,3,8,10,15,4};
        System.out.println(Arrays.toString(array));

        //数组排序,默认正序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //数组排序，倒序
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
