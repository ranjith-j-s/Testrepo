import java.util.Scanner;

public class testbin {
    public static void main(String[] args) {
        int i, k, j,h,q,m=0;
        Scanner bin = new Scanner(System.in);
        System.out.println("Enter the Binary digit");
        if (bin.hasNextInt()) {
            i = bin.nextInt();
            h=i;
            q=String.valueOf(i).length();
            for (j = 0; j < q; j++) {
                i = h % 10;
                k = (int)(i* Math.pow(2, j));
                k=m+k;
                if (j == q-1) {
                    System.out.println(k);
                }
                m=k;
                h=h/10;
            }
        }
    }
}
