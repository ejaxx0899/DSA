
// i/p N = 6
// o/p     0 1 1 2 3 5 8
import java.util.*;
public class p5_Fibonaaciseries {
    
    public static void main(String[] args) {
        
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int a = 0;
        int b = 1;

        
        for(int i =1;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
        inc.close();
    }
}
