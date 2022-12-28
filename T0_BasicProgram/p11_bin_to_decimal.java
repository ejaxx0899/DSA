import java.util.*;
public class p11_bin_to_decimal {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        int sum = 0;
        int mul = 1;
        while(n>0) {
            int rem = n%10;
            sum = sum+rem*mul;
            n=n/10;
           mul = mul*2;
        }
        System.out.println(sum);
        inc.close();
    }
}
