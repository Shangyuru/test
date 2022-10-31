package October_30_2022_course;

import java.util.List;

/**
*@ClassName: interfaceDemo
*@Description: 接口interfaceDemo,实现类interfaceDemo_Test
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:54
*/
public interface interfaceDemo {
    //常量
    String key = "appkey = J0Kw02Ps";
    String values = "";
    /**抽象方法
     * 获取用户信息接口
     */
    userDemo getUserInfo();
    List<userDemo> getUserALL();

}
