package Demo;

public class nine_for_nine {
    public static void main(String[] args) {
        for(int i = 1 ;i < 10 ;i++) {
            for(int j = 1 ;j < i+1 ;j++) {
                System.out.print(j + "*" + i + "=" + i * j + "   ");
            }
            System.out.println();
        }
    }
}
