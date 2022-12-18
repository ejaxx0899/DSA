/*  * * * * *
      * * * *
        * * *       OUTPUT
          * *
            * 
 */

import java.util.*;
public class p5 {
    
    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;

        int star = n;

        int space = 0;

        while (row<=n)
        {
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            row++;
            System.out.println();
            star--;
            space+=2;
        }

        inc.close();
    }
}
