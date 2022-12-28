// i/p = 3 6 1 4 5 2  
// o/p = 5 2 3 6 1 4 
import java.util.*;
public class p3_InverseNum {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        int pos = 1;
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum =(int)(sum + pos * Math.pow(10, rem-1));
            n=n/10;
            pos++;
        }
        System.out.println(sum);
        inc.close();
    }
    
}
