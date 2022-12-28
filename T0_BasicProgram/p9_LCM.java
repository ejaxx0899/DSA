import java.util.*;
public class p9_LCM {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n1 = inc.nextInt();
        int n2 = inc.nextInt();
        int a1 = n1;
        int b1 = n2;
        while(n1%n2 !=0) {
            int rem =n1%n2;
            n1=n2;
            n2=rem;
            
        }
        int gcd =n2;
        int lcm = (a1*b1)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        inc.close();
    }
    
}
