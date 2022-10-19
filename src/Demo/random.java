package Demo;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        boolean corr = true;
        while (corr) {
            if (sc.nextInt() == rd.nextInt(101)) {
                System.out.println("OK！");
                corr = false;
            }
        }
    }
}
