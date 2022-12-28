// i/p = 1 2 3 6 5   o/p = 5

import java.util.*;
public class p1_Countdigit {
    
    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int digit = 0;
        while(n>0) {
            n = n/10;
            digit++;
        }
        System.out.println(digit);
        inc.close();
    }
}
