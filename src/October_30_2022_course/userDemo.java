package October_30_2022_course;
/**
*@ClassName: userDemo
*@Description: 调用接口类
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:53
*/
public class userDemo {
    private Integer age;
    private String name;

    private String key;

    @Override
    public String toString() {
        return "userDemo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
