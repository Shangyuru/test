package IntergrtiveCase;
/**
*@ClassName: ticketClass
*@Description: 机票类
*@Author: ShangYuru
*@Date: 2022/11/3
*@Time: 20:42
*/
public class ticketClass {
    private double originPrice;
    private int month;
    private int type;

    public ticketClass() {
    }

    public ticketClass(double originPrice, int month, int type) {
        this.originPrice = originPrice;
        this.month = month;
        this.type = type;
    }

    public void setOriginPrice(double originPrice) {
        this.originPrice = originPrice;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getOriginPrice() {
        return originPrice;
    }

    public int getMonth() {
        return month;
    }

    public int getType() {
        return type;
    }
}
