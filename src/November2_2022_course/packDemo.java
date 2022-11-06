package November2_2022_course;
/**
*@ClassName: packDemo
*@Description: 包装类
*@Author: ShangYuru
*@Date: 2022/11/2
*@Time: 21:15
*/
public class packDemo {
    /**
     * 8种数据类型对应包装类
     * byte short int long short float double char
     * Byte Short Integer Long Double Floot Boolean Character
     * @param args
     */
    public static void main(String[] args) {
        int init = 10;
        //转为Integer
        Integer integer = new Integer(init);
        //转为int
        int a = integer.intValue();

        //自动装箱
        Integer integer1 = init;
        //自动拆箱
        int b = integer1;
    }
}
