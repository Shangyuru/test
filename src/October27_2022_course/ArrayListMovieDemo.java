package October27_2022_course;
/**
*@ClassName: ArrayListMovieDemo
*@Description: 电影测试类
*@Author: ShangYuru
*@Date: 2022/10/29
*@Time: 11:41
*/
import java.util.ArrayList;

public class ArrayListMovieDemo {
    public static void main(String[] args) {

        ArrayListMovie m1 = new ArrayListMovie("肖申克的救赎", 9.7, "弗兰克-德拉邦特");
        ArrayListMovie m2 = new ArrayListMovie("霸王别姬", 9.6, "陈凯歌");
        ArrayListMovie m3 = new ArrayListMovie("阿甘正传", 9.5, "罗伯特-泽米吉斯");
        ArrayList<ArrayListMovie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        for (int i = 0; i < movies.size(); i++) {
            ArrayListMovie m = movies.get(i);
            System.out.println("电影名称:" + m.getName());
            System.out.println("电影评分:" + m.getScore());
            System.out.println("电影演员:" + m.getActor());
            System.out.println("------------------------------------");
        }
    }
}
