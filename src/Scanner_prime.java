import java.util.Scanner;

public class Scanner_prime {
    public static void main(String[]args)
    {
        int i,j;
        Scanner prime1= new Scanner(System.in);
        System.out.println("Enter the Number");
        if(prime1.hasNextInt())
        {
           i=prime1.nextInt();
            for(j=2;j<=i;j++)
            {
                if(i==j)
                {
                    System.out.println(i+" "+"is a prime number");
                }
                else if(i%j==0)
                {
                    System.out.println(i+" "+"is not a prime number");
                    break;
                }
            }
        }
    }
}
