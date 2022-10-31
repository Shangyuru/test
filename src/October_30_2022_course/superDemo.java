package October_30_2022_course;
/**
*@ClassName: superDemo
*@Description: super关键字
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:22
*/
public class superDemo {
    //super调用父类的方法的关键字

    static class userParent{
        private String name = "SYR";
        public String getUserName1(){
            return "用户名---父类";
        }
    }

    static class userSon extends userParent{

        public String getUserName2() {
            String name = super.name;
            System.out.println(name);
            return super.getUserName1();
        }
    }

    public static void main(String[] args) {
        userSon userSon = new userSon();
        String userName2 = userSon.getUserName2();
        System.out.println(userName2);
    }
}
