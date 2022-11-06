package October30_2022_work;


public class workerMessage {
    private String name;        //姓名
    private int money;          //工资

    public workerMessage(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public workerMessage() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }
}
