import java.util.*;
public class p14_Armstrong {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        armstrong(n);
        inc.close();
    }

    public static int countofdigit(int n) {
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void armstrong(int n) {
        int x = countofdigit(n);
        int sum = 0;
        int a = n; 
        while(n>0){
            int rem = n%10;
            sum = (int)(sum + Math.pow(rem, x));
            n=n/10;
        }
        if(sum==a){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
}
