import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        int i;
        Scanner leap = new Scanner(System.in);
        System.out.println("Enter a number");
        if (leap.hasNextInt()) {
            i = leap.nextInt();
            if (i % 4 == 0 && i%100==0 && i%400==0) {
                System.out.println("it is a leap year");
            }else{
                System.out.println("it is not a leap year");
            }
        }
    }
}