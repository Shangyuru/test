package November2_2022_course;
/**
*@ClassName: reExpressionDemo
*@Description: re正则表达式
*@Author: ShangYuru
*@Date: 2022/11/2
*@Time: 21:16
*/
public class reExpressionDemo {

    public static void main(String[] args) {
        /**定义规则
         * 1.手机号匹配
         */

        String phone = "^[1][3,5,7,8]\\d{9}$";
        boolean matches = "13379182869".matches(phone);
        if (!matches){
            System.out.println("手机号格式错误！");
        }else System.out.println("OK!");

        //身份证匹配
        String idCard = "";
    }
}
