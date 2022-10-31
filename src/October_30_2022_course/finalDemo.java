package October_30_2022_course;
/**
*@ClassName: finalDemo
*@Description: final关键字
*@Author: ShangYuru
*@Date: 2022/10/30
*@Time: 20:22
*/
public class finalDemo {
    //修饰类不能被别的类继承
//    final class test1{
//
//    }
//    class test2 extends test1{
//
//    }

    //修饰方法
    class  test3{
        public long time(){
            long currentTimeMillis = System.currentTimeMillis();
            return currentTimeMillis;
        }
    }

    class test5 extends test3{
        @Override
        public long time() {
            return super.time();
        }
    }

    //修饰局部变量
    class test6{
        public static void main(String[] args) {
//                final String a = "a";
//                a = "A";
        }
    }


    //修饰成员变量
    class test7{
        final String b = "b";
//        public void set(){
//            b = "B";
//        }
    }
}
