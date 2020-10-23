public class prime {
    public static void main(String[] args) {
        int i,j;
        for(i=2;i<=100;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i==j)
                {
                    System.out.println(i);
                }
                else if(i%j==0)
                {
                    break;
                }
            }
        }
    }
}

//public class test {
//    public static void main(String[] args) {
//        int i,j;
//        for(i=2;i<=100;i++)
//        {
//            int k=0;
//            for(j=2;j<=i/2;j++)
//            {
//                if(i%j==0)
//                {
//                    k=1;
//                    break;
//                }
//            }
//            if(k==0)
//            {
//                System.out.println(i);
//            }
//        }
//    }
//}