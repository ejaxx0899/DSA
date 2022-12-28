// I/p = 1440

// O/p =  2 2 2 2 2 3 3 5
import java.util.*;
public class p7_primeFactor {
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int div = 2;
        while(div<=n) {
            while(n%div==0)   {
                n=n/div;
                System.out.print(div+" ");
            }
            div++;
        }
      /*   if(div!=1)
        {
            System.out.print(n);
        }*/
        inc.close();   
    }
        
    }
