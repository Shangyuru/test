package Demo;

public class DemoClass {
    public static void main(String[] args) {
        double mountainHeight = 8848860; // 山峰高度
        double paperThick = 0.1; // 纸张厚度
        int count = 0;  //计数
        while (paperThick < mountainHeight){
            paperThick *= 2;
            count++;
        }
        System.out.println("需要叠"+count+"次");
    }
}
