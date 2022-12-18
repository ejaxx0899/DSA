/*  * * * * *
        * * * *
            * * *       OUTPUT
                 * *
                    * 
 */

import java.util.*;
public class p6 {
    
    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;

        int star = n;

        int space = 0;

        while(row<=n)
        {
            int i=1;

            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }

            int j=1;

            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }

            row++;
            star--;
            space+=2;

            System.out.println();
        }


        inc.close();
    }
}
