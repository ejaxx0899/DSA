/*  OUTPUT

    * * * * * * * * *
    * * * *   * * * *
    * * *       * * *
    * *           * *
    *               *
    * *           * *
    * * *       * * *
    * * * *   * * * *
    * * * * * * * * *
 */

import java.util.*;
public class p18 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row =1;

        int star = n/2+1;

        int space = -1;

        while(row<=n)
        {
            int i = 1;

            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }

            int j = 1;

            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }

            int k=1;

            if(row==1 || row==n)
            {
                k=2;
            }

            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }

            row++;
            System.out.println();

            if(row<=n/2+1)
            {
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }

            
        }

        inc.close();
    }
    
}
