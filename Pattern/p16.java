/*  OUTOUT

* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

 */
import java.util.*;
public class p16 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;

        int star  = n;
        int space = -1;
       // int star2 = n;


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

            int k = 1;
            if(k==row)
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
            star--;
            space+=2;
            //star2--;
        }

        inc.close();
    }
    
}
