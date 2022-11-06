package October30_2022_work;

import java.util.Scanner;

public class worker_Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入工人姓名:");
        Worker worker = new Worker(scanner.next());
        System.out.println("请录入工人工龄:");
        Worker worker1 = new Worker(scanner.nextInt());
        System.out.println("该工人对象的属性信息如下:");
        System.out.println("姓名:"+worker.getName());
        System.out.println("工龄:"+worker1.getYear());
    }
}
