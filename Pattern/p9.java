/*         OUTPUT

            *
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *    
    
 */

import java.util.*;
public class p9 {
    
    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);
    
        int n = inc.nextInt();

        int row =1;

        int star = 1;

        int space = n-1;

        while(row<=n)
        {
            int i = 1;

            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }

            int j=1;
            while(j<=star)
            {
                if(j%2==0)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }

                j++;
            }

            row++;
            System.out.println();

            star+=2;
            space--;
        }
        inc.close();
    }
}
