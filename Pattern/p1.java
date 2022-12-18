/*  * * * * *
    * * * * *
    * * * * *       OUTPUT
    * * * * *
    * * * * * 
 */

import java.util.*;
public class p1 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;

        int star = n; // star to print in 1st row

        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }

            row++;
            System.out.println();
        }

        inc.close();

    }
    
}
