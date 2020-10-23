import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Scanner_Units {
    public static void main(String[] args) {
        int i,T,H,O,Th;
        Scanner unit = new Scanner(System.in);
        System.out.println("Enter the number");
        if (unit.hasNextInt()) {
            i = unit.nextInt();
            if(i<=999999999)
            {
                O = i%10;
                System.out.println(O+" "+"time ones");
                T = (i/10)%10;
                System.out.println(T+" "+"time tens");
                H = (i/100)%10;
                System.out.println(H+" "+"times hundreds");
                Th = (i/1000)%10;
                System.out.println(Th+" "+"times thousands");
            }
        }
    }
}
////===========================================================================================
////==========================================================================================
//import java.util.Scanner;
//
//public class test {
//    public static void main(String[] args) {
//        int i, k, j = 0, l;
//        Scanner unit = new Scanner(System.in);
//        System.out.println("Enter the number");
//        if (unit.hasNextInt()) {
//            i = unit.nextInt();
//            while (i != 0) {
//                k = i % 10;
//                i = i / 10;
//                j++;
//                    switch (j) {
//                        case 1:
//                            System.out.println(k+" "+"units");
//                            break;
//                        case 2:
//                            System.out.println(k+" "+"tens");
//                            break;
//                        case 3:
//                            System.out.println(k+" "+"hundreds");
//                            break;
//                        case 4:
//                            System.out.println(k+" "+"thousands");
//                            break;
//                        case 5:
//                            System.out.println(k+" "+"tenthousands");
//                            break;
//                        case 6:
//                            System.out.println(k+" "+"lakh");
//                            break;
//                }
//            }
//        }
//    }
//}
////===========================================================================================
////==========================================================================================
//// if(j == 1) System.out.println(k + " " + "Units");
////                    if(j==2) System.out.println(k+" "+"tens");
////                    if(j==3) System.out.println(k+" "+"Hundreds");
////                    if(j==4) System.out.println(k+" "+"thousands");
////                    if(j==5) System.out.println(k+" "+"Tenthousands");
////                    if(j==6) System.out.println(k+" "+"Lakhs");
////                    if(j==7) System.out.println(k+" "+"Tenlakhs");


