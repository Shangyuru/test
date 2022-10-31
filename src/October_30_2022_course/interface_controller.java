package October_30_2022_course;
/**
*@ClassName: interface_controller
*@Description: 接口测试类
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 21:21
*/
import java.util.List;

public class interface_controller {
    public static void main(String[] args) {
        //创建对象
        interfaceDemo_Test interfaceDemo_test = new interfaceDemo_Test();
        //获取用户信息
        userDemo userDemo = interfaceDemo_test.getUserInfo();
        System.out.println(userDemo);
        //获取用户的亲戚列表
        List<userDemo> userAll = interfaceDemo_test.getUserALL();
        System.out.println(userAll);


     }
}
