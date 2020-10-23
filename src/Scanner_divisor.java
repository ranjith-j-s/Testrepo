import java.util.Scanner;

public class Scanner_divisor {
    public static void main(String [] args)
    {
        int i,j;
        Scanner div = new Scanner(System.in);
        System.out.println("Enter the number");
        if(div.hasNextInt())
        {
            i=div.nextInt();
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    System.out.println(j+" "+"is the divisor of the number");
                }
            }
        }
    }
}
