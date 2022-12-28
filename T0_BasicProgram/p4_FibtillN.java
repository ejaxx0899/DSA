// Ip = 10  o/p = 55

import java.util.*;
public class p4_FibtillN {

    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();
        int a = 0;
        int b = 1;
       
        for(int i =1;i<=n;i++){
            int c = a+b;
             a=b;
             b=c;
        }
        System.out.println(a);
        
        inc.close();
    }
    
}
