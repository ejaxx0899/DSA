/*  
    * * * * *
    * * * * 
    * * *        OUTPUT
    * * 
    *  
 */

import java.util.*;
public class p3 {

    public static void main(String[] args)
    {
        Scanner inc = new Scanner(System.in);

        int n = inc.nextInt();

        int row = 1;

        int star = n;

        while (row<=n)
        {
            int i = 1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }

            row++;
            star--;
            System.out.println();
        }

        inc.close();
    }
    
}
