import java.util.*;
public class p15_Boston {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        System.out.println(primefactor(n));
        System.out.println(Boston(n));
        inc.close();
    }
    public static boolean Boston(int n) {
        int x = primefactor(n);
        int ans=0;
        while(n>0) {
            int rem = n%10;
            ans=ans+rem;
            n=n/10;
        }
        if(ans==x) {
            return true;
        }
        else{
            return false;
        }
    }

    public static int primefactor(int n){
        int sum = 0;
        int x = 0;
        for(int i= 2;i<=n;i++) {
            while(n%i==0){
                System.out.print(i+" ");
                n=n/i;
                x=i;
                while(x>0){
                    int rem=x%10;
                    x=x/10;
                    sum=sum+rem;
                }
            } 
        }
        System.out.println();
        return sum;
    }
}
