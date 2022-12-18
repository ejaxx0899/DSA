/*  OUTPUT
    
        *
      * * *
    * * * * * 
  * * * * * * *
    * * * * *
      * * *
        *  
 */

import java.util.*;
public class p17 {
    
    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;
        int star = 1;
        int space = n/2;

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
            if(row<=(n/2)+1)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star-=2;
            }
        }
        inc.close();
    }
}
