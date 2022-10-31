package October_30_2022_course;

import java.math.BigDecimal;

/**
*@ClassName: bigdecimalDemo
*@Description: BigDecimal类，用于精度补充
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:24
*/
public class bigdecimalDemo {
    public static void main(String[] args) {
        //double类型精度问题，用1+e形式补充精度
        BigDecimal bigDecimal = new BigDecimal(200);
        BigDecimal bigDecimal2 = new BigDecimal(3);
        BigDecimal bigDecimal3 = new BigDecimal(0);
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        if (bigDecimal3 == BigDecimal.ZERO){
            System.out.println(bigDecimal.divide(bigDecimal3));
        }else System.out.println("被除数为0!");
    }
}
