package October_30_2022_course;
/**
*@ClassName: systemDemo
*@Description: 系统类
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:37
*/
public class systemDemo {
    public static void main(String[] args) {
        //终止jar包虚拟机
//        System.exit(1);
        //手动回收垃圾GC
//        System.gc();
        //计算代码耗时
        long currentTimeMillis1 = System.currentTimeMillis();
        for (int i = 0; i < 200; i++){
            System.out.println("这是第"+i+"次打印");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        System.out.println("总耗时:"+ (currentTimeMillis2-currentTimeMillis1));
    }
}
