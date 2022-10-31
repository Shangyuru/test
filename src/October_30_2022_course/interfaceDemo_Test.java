package October_30_2022_course;

import java.util.ArrayList;
import java.util.List;

/**
*@ClassName: interfaceDemo_Test
*@Description: 实现类
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 21:18
*/
public class interfaceDemo_Test implements interfaceDemo{
    @Override
    public userDemo getUserInfo() {
        userDemo user = new userDemo();
        user.setName("张三");
        user.setAge(28);
        user.setKey(key);
        return user;
    }
    public List getUserALL(){
        List<userDemo> list = new ArrayList<>();

        userDemo user1 = new userDemo();
        user1.setName("李四");
        user1.setAge(22);

        userDemo user2 = new userDemo();
        user2.setName("王五");
        user2.setAge(22);
        list.add(user1);
        list.add(user2);

        return list;
    }
}
