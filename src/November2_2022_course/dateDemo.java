package November2_2022_course;
/**
*@ClassName: dateDemo
*@Description: 时间类
*@Author: ShangYuru
*@Date: 2022/11/2
*@Time: 21:15
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) {
        //获取当前时间
        Date date = new Date();
//        System.out.println(date);
        //获取date的时间戳
        long time = date.getTime();
//        System.out.println(time);
        /**
         * date类型转换为yyyy-mm-dd形式
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String format = simpleDateFormat.format(date);
//        System.out.println(format);

        String time1 = "2022-11-02 20:46:12";
        String time01 = "2022-11-11 20:00:00";
        String time02 = "2022-11-02 20:30:00";

        try {
            Date parse = simpleDateFormat.parse(time02);
            System.out.println(parse);
            boolean after = parse.after(new Date());
            System.out.println(after);
        } catch (ParseException e) {
            System.out.println("时间不在目前时间内!");
            throw new RuntimeException(e);
        }
    }
}
