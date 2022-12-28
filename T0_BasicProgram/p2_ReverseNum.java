//  i/p = 1 2 3 4 5    o/p = 5 4 3 2 1

import java.util.*;
public class p2_ReverseNum {

    public static void main(String[] args) {
        Scanner inc = new Scanner(System.in);
        int n = inc.nextInt();
        while(n>0) {
            int rem = n % 10;
            n = n/10;
            System.out.print(rem+" ");
        }
        inc.close();
    }
}
