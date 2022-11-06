package IntergrtiveCase;

import java.util.Scanner;

/**
*@ClassName: buyAirTicket
*@Description: 买机票实现类
*@Author: ShangYuru
*@Date: 2022/11/3
*@Time: 20:42
*/
public class buyAirTicket {
    public static void main(String[] args) {
        ticketClass ticket = scanner();
        double calculatePrice = calculate(ticket);
        System.out.print("折扣价格是："+calculatePrice);
    }
    private static ticketClass scanner (){
        ticketClass ticket = new ticketClass();
        Scanner scanner = new Scanner(System.in);
        double price;
        do {
            System.out.print("请输入飞机票原价:");
            price = scanner.nextInt();
        } while (price <= 0);
        ticket.setOriginPrice(price);
        int month = 0;
        do {
            System.out.print("请输入出行月份:");
            month = scanner.nextInt();
        } while (month<=0 || month>12);
        ticket.setMonth(month);
        int type;
        do {
            System.out.print("请输入机票类型1是头等舱，2是经济舱");
            type = scanner.nextInt();
        } while (type != 1 && type != 2);
        ticket.setType(type);
        return ticket;
    }
    private static double calculate(ticketClass ticket){
        double calculatePrice = 0;
        if (ticket.getMonth() >= 5 && ticket.getMonth() <= 10){
            switch (ticket.getType()){
                case 1:
                    calculatePrice = ticket.getOriginPrice()*0.9;
                    break;
                case 2:
                    calculatePrice = ticket.getOriginPrice()*0.85;
            }
        }else {
            switch (ticket.getType()){
                case 1:
                    calculatePrice = ticket.getOriginPrice()*0.7;
                    break;
                case 2:
                    calculatePrice = ticket.getOriginPrice()*0.65;
            }
        }
        return calculatePrice;
    }
}




