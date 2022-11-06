package November2_2022_course.streamlist;
/**
*@ClassName: Streamlist
*@Description: Stream流
*@Author: ShangYuru
*@Date: 2022/11/2
*@Time: 22:43
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Streamlist {
    public static void main(String[] args) {
        //
        List<user> userALlList = new ArrayList<>();
        userALlList.add(new user(18, "豪哥", "女"));
        userALlList.add(new user(19, "小周", "女"));
        userALlList.add(new user(20, "小张", "男"));
        userALlList.add(new user(20, "小尚", "女"));
        userALlList.add(new user(20, "魏楠", "男"));

        // 找到这list内的 年龄全部为20 的用户
        List<user> age20List = new ArrayList<>();
        for (user user : userALlList) {
            if (20 == user.getAge()) {
                age20List.add(user);
                //System.out.println("找到了当前年龄为20的用户"+user);
            }
        }
        System.out.println(age20List);
        // 改进写法：
        List<Integer> collect = userALlList.stream()
                .filter(user -> 20 == user.getAge())
                .map(user::getAge)
                .collect(Collectors.toList());
        System.out.println(collect);

        // 场景二：找到年龄为20的全部用户的 名称
        List<String> age20NameList = new ArrayList<>();
        for (user user : userALlList) {
            if (20 == user.getAge()) {
                age20NameList.add(user.getName());
            }
        }
        System.out.println(age20NameList);
        // 改进写法
        List<String> collect1 = userALlList.stream()
                .filter(user -> 20 == user.getAge()).map(user::getName).collect(Collectors.toList());
        System.out.println(collect1);

        // 场景三：找到年龄为20，并且性别为女的用户
        List<user> age20NameSexList = new ArrayList<>();
        for (user user : userALlList) {
            if (20 == user.getAge() && "女".equals(user.getSex())) {
                age20NameSexList.add(user);
            }
        }
        System.out.println(age20NameSexList);
        // 改进
        List<user> collect4 = userALlList.stream()
                .filter(user -> 20 == user.getAge() && "女".equals(user.getSex()))
                .collect(Collectors.toList());
        System.out.println(collect4);

        //找到名字为小张，且性别为男的人
        List<String> collect5 = userALlList.stream()
                .filter(user -> "小张" == user.getName() && "男".equals(user.getSex()))
                .map(user -> "小张")
                .collect(Collectors.toList());
        System.out.println(collect5);

    }
}
