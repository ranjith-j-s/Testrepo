import java.util.Scanner;

public class Scanner_numbers {
    public static void main(String[] args) {
        int i, j;
        Scanner even1 = new Scanner(System.in);
        System.out.println("Enter the number");
        if (even1.hasNextInt()) {
            i = even1.nextInt();
            for (j = 2; j <= i; j++) {
                if (i%2==0) {
                    System.out.println(i + " " + "is an even number");
                } else{
                    System.out.println(i + " " + "is an odd number");
                    break;
                }
            }
        }
    }
}
