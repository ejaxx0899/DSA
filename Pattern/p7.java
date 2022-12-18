/*         OUTPUT

            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *    
 */

import java.util.*;
public class p7 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;

        int space = n-1;

        int star = 1;

        while(row<=n)
        {
            int i = 1;

            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }

            int j = 1;

            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }

            row++;

            System.out.println();
            space--;
            star+=2;
        }

        inc.close();
    }
    
}
