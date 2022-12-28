import java.util.*;
public class p12_anybase_to_anybase {

    public static int decimaltoanybase(int n,int b) {
        int ans = 0;
        int mul=1;
        while(n>0){
            int rem = n%b;
            n = n/b;
            ans+=rem*mul;
            mul = mul*10;
        }
        return ans;
    }
    public static int anybasetodecimal(int n,int b){
            int ans1=0;
            int mul = 1;
            while(n>0){
                int rem = n%10;
                n=n/10;
                ans1+=rem*mul;

                mul=mul*b;
            }
            return ans1;
    }
    public static int getvalue(int n, int b1,int b2){
        int dec = anybasetodecimal(n, b1);
        int dn = decimaltoanybase(dec, b2);
        return dn;
    }
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        int b1 = inc.nextInt();
        int b2 = inc.nextInt();
        int d = getvalue(n, b1, b2);
        System.out.println(d);
        inc.close();
    }
}
