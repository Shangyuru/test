package October27_2022_course;

/**
*@ClassName: ArrayListStudentDemo
*@Description: 学生测试类
*@Author: ShangYuru
*@Date: 2022/10/29
*@Time: 11:42
*/
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListStudentDemo {
        public static void main(String[] args) {

            ArrayList<ArrayListStudent> students = new ArrayList<>();
            students.add(new ArrayListStudent("20180302","叶孤城",23,"护理一班"));
            students.add(new ArrayListStudent("20180303","东方不败",23,"推拿二班"));
            students.add(new ArrayListStudent("20180304","西门吹雪",26,"中药学四班"));
            students.add(new ArrayListStudent("20180305","梅超风",26,"神经科二班"));
            System.out.println("学号"+"\t\t\t\t"+"姓名"+"\t\t"+"年龄"+"\t\t"+"班级");
            for (int i = 0; i < students.size(); i++) {
                ArrayListStudent s=students.get(i);
                System.out.println(s.getStudentId()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"\t\t"+s.getClassName());
            }


            Scanner scanner = new Scanner(System.in);
            ArrayListStudent student;
            boolean change = true;
            while (change){
                System.out.print("请输入要查询的学号:");
                student = getStudentById(students, scanner.next());
                if (student==null){
                    System.out.println("查无此人!");
                }
                else {
                    System.out.println(student.getStudentId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getClassName());
                }
                System.out.print("是否继续查询?\n是->Y,否->N:");
                if (scanner.next().equalsIgnoreCase("n")){
                    change = false;
                }else change = true;
            }

        }

        public static ArrayListStudent getStudentById(ArrayList<ArrayListStudent> students,String id) {
            for (int i = 0; i < students.size(); i++) {
                ArrayListStudent s = students.get(i);
                if (s.getStudentId().equals(id)){
                    return s;
                }
            }
            return null;
        }
    }
