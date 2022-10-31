package October_30_2022_course;
/**
*@ClassName: mathDemo
*@Description: 数学类
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:22
*/
public class mathDemo {
    //获取数字绝对值
    public static void main(String[] args) {
        int a = -1;
        System.out.println(Math.abs(a));

        //向上取整
        double b = 3.3;
        System.out.println(Math.ceil(b));

        //向下取整
        System.out.println(Math.floor(b));

        //四舍五入
        double d = 5.6;
        System.out.println(Math.round(d));
    }
}
