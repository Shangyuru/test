package November2_2022_course.streamlist;
/**
*@ClassName: user
*@Description: 用户类
*@Author: ShangYuru
*@Date: 2022/11/2
*@Time: 22:42
*/
public class user {
    private Integer age;
    private String name;
    private String sex;

    public user() {
    }

    public user(Integer age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "user{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
