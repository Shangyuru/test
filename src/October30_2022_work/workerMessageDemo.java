package October30_2022_work;

import java.util.ArrayList;
import java.util.Scanner;

public class workerMessageDemo {
    public static void main(String[] args) {
        boolean pass = true;
        boolean change = true;
        ArrayList<workerMessage> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (pass){
            System.out.println("请输入员工姓名及工资:");
            arrayList.add(new workerMessage(scanner.next(), scanner.nextInt()));
            System.out.print("是否继续存入员工信息?是T否F:");
            String input = scanner.next();
            if (input.equalsIgnoreCase("F")){
                pass = false;
            }else if (!input.equalsIgnoreCase("F") && !input.equalsIgnoreCase("T")){
                System.out.println("输入错误，请重新输入!");
                break;
            }
        }
        while (change){
            System.out.println("--------------------以下是选择菜单----------------------");
            System.out.println("1.更改姓名");
            System.out.println("2.删除员工信息");
            System.out.println("3.增加工资");
            System.out.println("4.减少工资");
            System.out.println("--------------------请选择操作号------------------------");
            switch (scanner.nextInt()){
                case 1:{
                    System.out.print("需要更改的姓名:");
                    String name = scanner.next();
                    for (int i = 0; i < arrayList.size(); i++) {
                        workerMessage worker = arrayList.get(i);
                        if (worker.getName() != name){
                            System.out.println("员工姓名不存在!");
                            return;
                        }
                        if (name.equals(worker.getName())){
                            System.out.print("更改为:");
                            worker.setName(scanner.next());
                            arrayList.set(i,worker);
                        }
                    }
                    System.out.println("更改后的名单为:");
                    for (int j = 0; j < arrayList.size(); j++) {
                        workerMessage worker = arrayList.get(j);
                        System.out.println(worker.getName()+worker.getMoney());
                    }
                }break;
                case 2:{
                    System.out.print("需要删除的员工姓名:");
                    String name = scanner.next();
                    for (int k = 0; k < arrayList.size(); k++){
                        workerMessage worker = arrayList.get(k);
                        if (worker.getName() != name){
                            System.out.println("员工姓名不存在!");
                            return;
                        }
                        if (worker.getName().equals(name)){
                            arrayList.remove(worker);
                        }
                    }
                    System.out.println("更改后的名单为:");
                    for (int j = 0; j < arrayList.size(); j++) {
                        workerMessage worker = arrayList.get(j);
                        System.out.println(worker.getName()+worker.getMoney());
                    }
                }break;
                case 3:{
                    System.out.print("需要增加工资的员工姓名:");
                    String name = scanner.next();
                    for (int i = 0; i < arrayList.size(); i++){
                        workerMessage worker = arrayList.get(i);
                        if (worker.getName() != name){
                            System.out.println("员工姓名不存在!");
                            return;
                        }
                    }
                    System.out.print("增加工资数:");
                    int money = scanner.nextInt();
                    for (int i = 0; i < arrayList.size(); i++){
                        workerMessage worker = arrayList.get(i);
                        if (worker.getName().equals(name)){
                            worker.setMoney(worker.getMoney()+money);
                        }
                    }
                    System.out.println("更改后的名单为:");
                    for (int j = 0; j < arrayList.size(); j++) {
                        workerMessage worker = arrayList.get(j);
                        System.out.println(worker.getName()+worker.getMoney());
                    }
                }break;
                case 4:{
                    System.out.print("需要减少工资的员工姓名:");
                    String name = scanner.next();
                    for (int i = 0; i < arrayList.size(); i++){
                        workerMessage worker = arrayList.get(i);
                        if (worker.getName() != name){
                            System.out.println("员工姓名不存在!");
                            return;
                        }
                    }
                    System.out.print("减少工资数:");
                    int money = scanner.nextInt();
                    for (int i = 0; i < arrayList.size(); i++){
                        workerMessage worker = arrayList.get(i);
                        if (worker.getName().equals(name)){
                            worker.setMoney(worker.getMoney()-money);
                        }
                    }
                    System.out.println("更改后的名单为:");
                    for (int j = 0; j < arrayList.size(); j++) {
                        workerMessage worker = arrayList.get(j);
                        System.out.println(worker.getName()+worker.getMoney());
                    }
                }break;
                default: System.out.print("无查询结果!");
            }
            System.out.print("是否继续执行操作?是T否F:");
            String end = scanner.next();
            if (end.equalsIgnoreCase("F")){
                System.out.println("感谢使用,再见!");
                change = false;
            }else if (!end.equalsIgnoreCase("F") && !end.equalsIgnoreCase("T")){
                System.out.print("输入错误，请重新输入!");
            }
        }

    }

}
