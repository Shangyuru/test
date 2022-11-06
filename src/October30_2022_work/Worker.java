package October30_2022_work;

public class Worker {
    private String name;        //姓名
    private int year;           //工龄

    public Worker(String name){
        this.name = name;

    }
    public Worker(int year){
        this.year = year;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
