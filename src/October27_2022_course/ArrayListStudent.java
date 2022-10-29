package October27_2022_course;
/**
*@ClassName: ArrayListStudent
*@Description: 学生类
*@Author: ShangYuru
*@Date: 2022/10/29
*@Time: 11:41
*/
public class  ArrayListStudent{
    private String studentId;
    private  String name;
    private  int age;
    private   String className;

    public ArrayListStudent(String studentId, String name, int age, String className) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public ArrayListStudent() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}