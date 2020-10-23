public class alt_prime {
    public static void main(String[] args) {
        int i,j,l=0;
        for(i=2;i<=100;i++)
        {
            int k=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    k=1;
                    break;
                }
            }
            if(k==0)
            {
                if(l % 3 == 0)
                {
                    System.out.println(i);
                }
                l++;
            }
        }
    }
}
